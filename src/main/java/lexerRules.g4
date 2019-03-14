lexer grammar lexerRules;

/* Special functions */
SCALE       : 'scale'
            ;

READ        : 'read'
            ;

PRINT       : 'print'
            ;

LAST        : 'last'
            ;

/* Boolean operators precedence (highest to lowest): !, &&, || */
AND         : '&&'
            ;

OR          : '||'
            ;

NOT         : '!'
            ;

/* Unary operators */
INC         : '++'
            ;

DEC         : '--'
            ;

/* Binary operators (highest to lowest): *, /, +, -*/
PLUS        : '+'
            ;

MINUS       : '-'
            ;

DIV         : '/'
            ;

MUL         : '*'
            ;

MOD         : '%'
            ;

POW         : '^'
            ;

EQUAL       : '='
            ;

/* Relational Operators */
LT          : '<'
            ;

GT          : '>'
            ;

LTEQ        : '<='
            ;

GTEQ        : '>='
            ;

EQEQ        : '=='
            ;

NOTEQ       : '!='
            ;

/* Math functions */

SQRT        : 'sqrt'
            ;

SIN         : 's'
            ;

COS         : 'c'
            ;

LOG         : 'l'
            ;

EXP         : 'e'
            ;

/*  Statements  */
IF          : 'if'
            ;

ELSE        : 'else'
            ;

FOR         : 'for'
            ;

WHILE       : 'while'
            ;

DEFINE      : 'define'
            ;

BREAK       : 'break'
            ;

CONTINUE    : 'continue'
            ;

RETURN      : 'return'
            ;

/* Extra Chracters */
OPAREN      : '('
            ;

CPAREN      : ')'
            ;

OBRACE      : '{'
            ;

CBRACE      : '}'
            ;

COMMA       : ','
            ;

/* Terminating character */
TERMINATOR  : ';'
            ;

/* Matches variables */
VARIABLE    : [a-z]+[0-9]*;

/*  Matches whole or real number */
NUMBER      : [0-9]+('.'[0-9]+)?;

/* Matches new line */
NEWLINE     : '\r\n';

/* Mathces single line comment */
SLCMNT      : '#'.*?'\r\n'          -> skip;

/* Matches multiline comment */
MLCMNT      : '/*'.*?'*/''\r\n'?    ->  skip;

WS          : [ \t\r\n]+            ->  skip ;