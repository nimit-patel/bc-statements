# bc
Basic Calculator (bc) using ANTLR4. 

##  Currently working Functionalities
  
    Comments: Single line (# ... ) and multi-line commens /* ... */
    Basic expressions with variables (++, --, -, =, <op>=)
    Boolean Expressions (&&, ||, !)
    Precedence of (+,-,*,/,%,^)
    Special Expression: read() for user input, scale assignment 
    Statements: expressions value is printed on execution, print expresstions
    Math library functions: sqrt, sin, cos, log, exp functions
    
    If else statements
    While loops
    For loop 
    User defined functions

    Special keyword return, break,and  continue

    Note: print expressions command prints new line after evaluating each expression for readability.

## Testing

Test folder includes some test files with output in comments.

###  Running the tests

Test is done via by providing an input file that contains bc code.

```
   mvn clean install
   mvn exec:java -Dexec.args="testfile.bc"
```
