grammar bc;
import lexerRules;

bc          : code+
            | EOF
            ;

code        : statement
            | function
            ;

statement   : math_expr
            | if_else
            | while_loop
            | for_loop
            | loop_stat
            | return_stat
            | print_stat
            | statement TERMINATOR
            | statement NEWLINE
            ;

function    : DEFINE VARIABLE OPAREN ((VARIABLE COMMA)* VARIABLE)? CPAREN block
            ;

return_stat : RETURN expression?
            ;

loop_stat   : BREAK
            | CONTINUE
            ;

func_call   : VARIABLE OPAREN (expression COMMA)* expression CPAREN TERMINATOR?
            ;

print_stat  : PRINT expression COMMA?
            ;

if_else     : IF expression block (ELSE block)?
            ;

while_loop  : WHILE expression block
            ;

for_loop    : FOR OPAREN expression TERMINATOR expression TERMINATOR expression CPAREN block
            ;

block       : OBRACE statement* CBRACE TERMINATOR?
            ;

math_expr   : expression
            ;

expression  : func_call                                                   # funcExpr
            | var                                                         # varExpr
            | expression POW expression                                   # powExpr
            | expression op = (MUL | DIV | MOD) expression                # multiplicativeExpr
            | expression op = (PLUS | MINUS) expression                   # additiveExpr
            | expression op = (LT | GT | LTEQ | GTEQ | EQEQ | NOTEQ) expression # relationalExpr
            | NOT expression                                              # notExpr
            | expression AND expression                                   # andExpr
            | expression OR expression                                    # orExpr
            | op = (SQRT | SIN | COS | LOG | EXP) OPAREN expression CPAREN  # mathFuncExpr
            | SCALE EQUAL expression                                      # scaleExpr
            | READ OPAREN CPAREN                                          # readExpr
            | atomic                                                      # atomExpr
            ;

atomic      : NUMBER                                                      # number
            | MINUS NUMBER                                                # minusNumber
            | OPAREN expression CPAREN                                    # paren
            ;

var         : VARIABLE                                                    # variable
            | op = (INC | DEC) VARIABLE                                   # preOpVariableExpr
            | VARIABLE op = (INC | DEC)                                   # postOpVariableExpr
            | MINUS VARIABLE                                              # unaryMinusExpr
            | VARIABLE op = (MUL | DIV | PLUS | MINUS | MOD | POW) EQUAL expression # arithmeticAssignExpr
            | VARIABLE EQUAL expression                                   # assignExpr
            ;
