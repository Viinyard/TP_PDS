// Generated from TurtleParser.g4 by ANTLR 4.7

  package TP1;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TurtleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, CHEV_OPEN=2, CHEV_CLOSE=3, COMMA=4, DOT=5, QUOTE=6, SEMICOLON=7, 
		STRING=8;
	public static final int
		RULE_document = 0, RULE_listSujet = 1, RULE_sujet = 2, RULE_listVerbe = 3, 
		RULE_verbe = 4, RULE_listComp = 5, RULE_complement = 6, RULE_complementString = 7, 
		RULE_complementId = 8, RULE_id = 9;
	public static final String[] ruleNames = {
		"document", "listSujet", "sujet", "listVerbe", "verbe", "listComp", "complement", 
		"complementString", "complementId", "id"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'<'", "'>'", "','", "'.'", "'\"'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "CHEV_OPEN", "CHEV_CLOSE", "COMMA", "DOT", "QUOTE", "SEMICOLON", 
		"STRING"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TurtleParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TurtleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public ASD.Document out;
		public ListSujetContext ls;
		public TerminalNode EOF() { return getToken(TurtleParser.EOF, 0); }
		public ListSujetContext listSujet() {
			return getRuleContext(ListSujetContext.class,0);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			((DocumentContext)_localctx).ls = listSujet();
			setState(21);
			match(EOF);
			 ((DocumentContext)_localctx).out =  new ASD.Document(new Fichier(((DocumentContext)_localctx).ls.lSujet)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListSujetContext extends ParserRuleContext {
		public ArrayList<Sujet> lSujet;
		public SujetContext s;
		public ListSujetContext l;
		public TerminalNode DOT() { return getToken(TurtleParser.DOT, 0); }
		public SujetContext sujet() {
			return getRuleContext(SujetContext.class,0);
		}
		public ListSujetContext listSujet() {
			return getRuleContext(ListSujetContext.class,0);
		}
		public ListSujetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listSujet; }
	}

	public final ListSujetContext listSujet() throws RecognitionException {
		ListSujetContext _localctx = new ListSujetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listSujet);

					((ListSujetContext)_localctx).lSujet =  new ArrayList<Sujet>();
				
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(24);
				((ListSujetContext)_localctx).s = sujet();
				setState(25);
				match(DOT);
				}
				 
							_localctx.lSujet.add(((ListSujetContext)_localctx).s.s); 
							
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(29);
				((ListSujetContext)_localctx).s = sujet();
				setState(30);
				match(DOT);
				setState(31);
				((ListSujetContext)_localctx).l = listSujet();
				}
				 
								_localctx.lSujet.add(((ListSujetContext)_localctx).s.s); _localctx.lSujet.addAll(((ListSujetContext)_localctx).l.lSujet); 
							
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SujetContext extends ParserRuleContext {
		public Sujet s;
		public IdContext i;
		public ListVerbeContext l;
		public TerminalNode CHEV_OPEN() { return getToken(TurtleParser.CHEV_OPEN, 0); }
		public TerminalNode CHEV_CLOSE() { return getToken(TurtleParser.CHEV_CLOSE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ListVerbeContext listVerbe() {
			return getRuleContext(ListVerbeContext.class,0);
		}
		public SujetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sujet; }
	}

	public final SujetContext sujet() throws RecognitionException {
		SujetContext _localctx = new SujetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sujet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(CHEV_OPEN);
			setState(38);
			((SujetContext)_localctx).i = id();
			setState(39);
			match(CHEV_CLOSE);
			setState(40);
			((SujetContext)_localctx).l = listVerbe();
			 ((SujetContext)_localctx).s =  new Sujet(((SujetContext)_localctx).i.nameId, ((SujetContext)_localctx).l.lVerbe); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListVerbeContext extends ParserRuleContext {
		public List<Verbe> lVerbe;
		public VerbeContext v;
		public ListVerbeContext l;
		public VerbeContext verbe() {
			return getRuleContext(VerbeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TurtleParser.SEMICOLON, 0); }
		public ListVerbeContext listVerbe() {
			return getRuleContext(ListVerbeContext.class,0);
		}
		public ListVerbeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listVerbe; }
	}

	public final ListVerbeContext listVerbe() throws RecognitionException {
		ListVerbeContext _localctx = new ListVerbeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listVerbe);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				((ListVerbeContext)_localctx).v = verbe();
				 ((ListVerbeContext)_localctx).lVerbe =  new ArrayList<Verbe>(); _localctx.lVerbe.add(((ListVerbeContext)_localctx).v.ver); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				((ListVerbeContext)_localctx).v = verbe();
				setState(47);
				match(SEMICOLON);
				setState(48);
				((ListVerbeContext)_localctx).l = listVerbe();
				 ((ListVerbeContext)_localctx).lVerbe =  new ArrayList<Verbe>(); _localctx.lVerbe.add(((ListVerbeContext)_localctx).v.ver); _localctx.lVerbe.addAll(((ListVerbeContext)_localctx).l.lVerbe); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerbeContext extends ParserRuleContext {
		public Verbe ver;
		public IdContext i;
		public ListCompContext l;
		public TerminalNode CHEV_OPEN() { return getToken(TurtleParser.CHEV_OPEN, 0); }
		public TerminalNode CHEV_CLOSE() { return getToken(TurtleParser.CHEV_CLOSE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ListCompContext listComp() {
			return getRuleContext(ListCompContext.class,0);
		}
		public VerbeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbe; }
	}

	public final VerbeContext verbe() throws RecognitionException {
		VerbeContext _localctx = new VerbeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_verbe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(CHEV_OPEN);
			setState(54);
			((VerbeContext)_localctx).i = id();
			setState(55);
			match(CHEV_CLOSE);
			setState(56);
			((VerbeContext)_localctx).l = listComp();
			 ((VerbeContext)_localctx).ver =  new Verbe(((VerbeContext)_localctx).i.nameId, ((VerbeContext)_localctx).l.lRestComp); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListCompContext extends ParserRuleContext {
		public List<Complement> lRestComp;
		public ComplementContext c;
		public ListCompContext l;
		public ComplementContext complement() {
			return getRuleContext(ComplementContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(TurtleParser.COMMA, 0); }
		public ListCompContext listComp() {
			return getRuleContext(ListCompContext.class,0);
		}
		public ListCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listComp; }
	}

	public final ListCompContext listComp() throws RecognitionException {
		ListCompContext _localctx = new ListCompContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listComp);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				((ListCompContext)_localctx).c = complement();
				 ((ListCompContext)_localctx).lRestComp =  new ArrayList<Complement>(); _localctx.lRestComp.add(((ListCompContext)_localctx).c.comp); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				((ListCompContext)_localctx).c = complement();
				setState(63);
				match(COMMA);
				setState(64);
				((ListCompContext)_localctx).l = listComp();
				 ((ListCompContext)_localctx).lRestComp =  new ArrayList<Complement>(); _localctx.lRestComp.add(((ListCompContext)_localctx).c.comp);  _localctx.lRestComp.addAll(((ListCompContext)_localctx).l.lRestComp); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplementContext extends ParserRuleContext {
		public Complement comp;
		public ComplementStringContext cs;
		public ComplementIdContext ci;
		public ComplementStringContext complementString() {
			return getRuleContext(ComplementStringContext.class,0);
		}
		public ComplementIdContext complementId() {
			return getRuleContext(ComplementIdContext.class,0);
		}
		public ComplementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complement; }
	}

	public final ComplementContext complement() throws RecognitionException {
		ComplementContext _localctx = new ComplementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_complement);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				((ComplementContext)_localctx).cs = complementString();
				 ((ComplementContext)_localctx).comp =  ((ComplementContext)_localctx).cs.compString; 
				}
				break;
			case CHEV_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				((ComplementContext)_localctx).ci = complementId();
				 ((ComplementContext)_localctx).comp =  ((ComplementContext)_localctx).ci.compId; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplementStringContext extends ParserRuleContext {
		public ComplementString compString;
		public Token s;
		public List<TerminalNode> QUOTE() { return getTokens(TurtleParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(TurtleParser.QUOTE, i);
		}
		public TerminalNode STRING() { return getToken(TurtleParser.STRING, 0); }
		public ComplementStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complementString; }
	}

	public final ComplementStringContext complementString() throws RecognitionException {
		ComplementStringContext _localctx = new ComplementStringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_complementString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(QUOTE);
			setState(78);
			((ComplementStringContext)_localctx).s = match(STRING);
			setState(79);
			match(QUOTE);
			 ((ComplementStringContext)_localctx).compString =  new ComplementString((((ComplementStringContext)_localctx).s!=null?((ComplementStringContext)_localctx).s.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplementIdContext extends ParserRuleContext {
		public ComplementId compId;
		public IdContext i;
		public TerminalNode CHEV_OPEN() { return getToken(TurtleParser.CHEV_OPEN, 0); }
		public TerminalNode CHEV_CLOSE() { return getToken(TurtleParser.CHEV_CLOSE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ComplementIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complementId; }
	}

	public final ComplementIdContext complementId() throws RecognitionException {
		ComplementIdContext _localctx = new ComplementIdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_complementId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(CHEV_OPEN);
			setState(83);
			((ComplementIdContext)_localctx).i = id();
			setState(84);
			match(CHEV_CLOSE);
			 ((ComplementIdContext)_localctx).compId =  new ComplementId(((ComplementIdContext)_localctx).i.nameId); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public Id nameId;
		public Token s;
		public TerminalNode STRING() { return getToken(TurtleParser.STRING, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			((IdContext)_localctx).s = match(STRING);
			 ((IdContext)_localctx).nameId =  new Id((((IdContext)_localctx).s!=null?((IdContext)_localctx).s.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n]\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3&\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\66\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7F\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\bN\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\2V\2\26\3\2\2\2\4%\3"+
		"\2\2\2\6\'\3\2\2\2\b\65\3\2\2\2\n\67\3\2\2\2\fE\3\2\2\2\16M\3\2\2\2\20"+
		"O\3\2\2\2\22T\3\2\2\2\24Y\3\2\2\2\26\27\5\4\3\2\27\30\7\2\2\3\30\31\b"+
		"\2\1\2\31\3\3\2\2\2\32\33\5\6\4\2\33\34\7\7\2\2\34\35\3\2\2\2\35\36\b"+
		"\3\1\2\36&\3\2\2\2\37 \5\6\4\2 !\7\7\2\2!\"\5\4\3\2\"#\3\2\2\2#$\b\3\1"+
		"\2$&\3\2\2\2%\32\3\2\2\2%\37\3\2\2\2&\5\3\2\2\2\'(\7\4\2\2()\5\24\13\2"+
		")*\7\5\2\2*+\5\b\5\2+,\b\4\1\2,\7\3\2\2\2-.\5\n\6\2./\b\5\1\2/\66\3\2"+
		"\2\2\60\61\5\n\6\2\61\62\7\t\2\2\62\63\5\b\5\2\63\64\b\5\1\2\64\66\3\2"+
		"\2\2\65-\3\2\2\2\65\60\3\2\2\2\66\t\3\2\2\2\678\7\4\2\289\5\24\13\29:"+
		"\7\5\2\2:;\5\f\7\2;<\b\6\1\2<\13\3\2\2\2=>\5\16\b\2>?\b\7\1\2?F\3\2\2"+
		"\2@A\5\16\b\2AB\7\6\2\2BC\5\f\7\2CD\b\7\1\2DF\3\2\2\2E=\3\2\2\2E@\3\2"+
		"\2\2F\r\3\2\2\2GH\5\20\t\2HI\b\b\1\2IN\3\2\2\2JK\5\22\n\2KL\b\b\1\2LN"+
		"\3\2\2\2MG\3\2\2\2MJ\3\2\2\2N\17\3\2\2\2OP\7\b\2\2PQ\7\n\2\2QR\7\b\2\2"+
		"RS\b\t\1\2S\21\3\2\2\2TU\7\4\2\2UV\5\24\13\2VW\7\5\2\2WX\b\n\1\2X\23\3"+
		"\2\2\2YZ\7\n\2\2Z[\b\13\1\2[\25\3\2\2\2\6%\65EM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}