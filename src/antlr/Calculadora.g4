grammar Calculadora;

@header {
    package antlr;
}

/* ID de inicio */
prog: (statement)+ EOF                                      #Program
    ;

/* Expresiones */
statement:
      if_statement                                         
    | assign_statement                                       
    | while_statement                                       
    | print_statement                                       
    | input_statement                                              
    ;

while_statement:
    'while' booleanexpression '{' (statement)+ '}'          #WhileStatement
    ;

if_statement:
    'if' booleanexpression '{' (statement)+ '}'             #IfStatement
    ;

assign_statement:                                           
    ID '=' exp                                              #AssignStatement
    ;

input_statement:
    ID '= Input(' STRING ')'                                #InputStatement
    ;

print_statement:                                            
    'Print(' STRING ')'                                     #PrintText
    | 'Print(' ID ')'                                       #PrintId
    ;

booleanexpression:
    exp COMPARATION_OPERATOR exp                            #Comparation
    ;

exp:
      term                                                  #Termino
    | exp SUM_OPERATOR term                                 #Addition
    ;

term:
      factor                                                #Factores
    | term MUL_OPERATOR factor                              #Multiplication
    ;

factor:
      NUM                                                   #Number
    | ID                                                    #Variable
    | '(' exp ')'                                           #ExpressionParenthesis
    ;

/* Tokens */

ID: [a-z]+[a-zA-Z0-9_]*;
NUM : [0-9]+;
STRING : '"' [a-zA-Z0-9 ]+ '"';


SUM_OPERATOR: '+' | '-' ;
MUL_OPERATOR: '*' | '/' | '%' ;

COMPARATION_OPERATOR: '=='|'!=' ;

WS : [ \r\n\t] -> skip;
