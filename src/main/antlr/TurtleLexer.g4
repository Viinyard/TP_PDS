lexer grammar TurtleLexer;

options {
  language = Java;
}

@header {
  package TP1;
}

WS : (' '|'\n'|'\t'|'\r'|'\u000C')+ -> skip
   ;

fragment ASCII  : ~('\n'|'"'|'<'|'>'|'.'|';'|',');

CHEV_OPEN : '<';
CHEV_CLOSE : '>';
COMMA : ',';
DOT : '.';
QUOTE : '"';
SEMICOLON : ';';

STRING : ASCII+; 

