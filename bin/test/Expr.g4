grammar Expr;

@header {
    package antlr;
}

//Variable de inicio
prog: (decl | expr)+ EOF
    ;

decl: ID ':' INT_TYPE '=' NUM
    ;

expr: expr '*' expr
    | expr '+' expr
    | ID
    | NUM
    ;


/* Tokens */
ID : [a-z][a-zA-Z0-0_]*;

NUM : '0' | '-'?[1-9][0-9]*;
INT_TYPE : 'INT';
COMMENT : '--' ~[\r\n]* -> skip;
WHITESPACE : [ \t\r\n]+ -> skip;