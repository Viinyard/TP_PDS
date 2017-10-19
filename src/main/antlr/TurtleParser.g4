parser grammar TurtleParser;

options {
  language = Java;
  tokenVocab = TurtleLexer;
}

@header {
  package TP1;
}

document returns [ASD.Document out]
  : ls=listSujet EOF { $out = new ASD.Document(new Fichier($ls.lSujet)); }
  ;
  


listSujet returns [ ArrayList<Sujet> lSujet ] 
		@init {
			$lSujet = new ArrayList<Sujet>();
		}
	: 
		(s=sujet DOT) { 
			$lSujet.add($s.s); 
			}
	| 
		(s=sujet DOT l=listSujet) { 
				$lSujet.add($s.s); $lSujet.addAll($l.lSujet); 
			}
;

sujet returns [Sujet s]
	: CHEV_OPEN i=id CHEV_CLOSE l=listVerbe { $s = new Sujet($i.nameId, $l.lVerbe); }
;

listVerbe returns [List<Verbe> lVerbe]
	: v=verbe { $lVerbe = new ArrayList<Verbe>(); $lVerbe.add($v.ver); }
	| v=verbe SEMICOLON l = listVerbe { $lVerbe = new ArrayList<Verbe>(); $lVerbe.add($v.ver); $lVerbe.addAll($l.lVerbe); }
;

verbe returns [Verbe ver]
	:	CHEV_OPEN i=id CHEV_CLOSE l=listComp { $ver = new Verbe($i.nameId, $l.lRestComp); } 
;	

listComp returns [List<Complement> lRestComp]
	: c=complement { $lRestComp = new ArrayList<Complement>(); $lRestComp.add($c.comp); }
	| c=complement COMMA l=listComp { $lRestComp = new ArrayList<Complement>(); $lRestComp.add($c.comp);  $lRestComp.addAll($l.lRestComp); }
;
complement returns [Complement comp]
	: cs=complementString { $comp = $cs.compString; }
	| ci = complementId { $comp = $ci.compId; }
;

complementString returns [ComplementString compString]
	: QUOTE s=STRING QUOTE { $compString = new ComplementString($s.text); }
;

complementId returns [ComplementId compId]
	: CHEV_OPEN i=id CHEV_CLOSE { $compId = new ComplementId($i.nameId); }
;

id returns [Id nameId]
  	: s = STRING { $nameId = new Id($s.text); }
;



