// Generated from C:/Users/Nimit/Downloads/Programming/ANTLR Projects/bc-statements/src/main/java\bc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCALE=1, READ=2, PRINT=3, LAST=4, AND=5, OR=6, NOT=7, INC=8, DEC=9, PLUS=10, 
		MINUS=11, DIV=12, MUL=13, MOD=14, POW=15, EQUAL=16, LT=17, GT=18, LTEQ=19, 
		GTEQ=20, EQEQ=21, NOTEQ=22, SQRT=23, SIN=24, COS=25, LOG=26, EXP=27, IF=28, 
		ELSE=29, FOR=30, WHILE=31, DEFINE=32, BREAK=33, CONTINUE=34, RETURN=35, 
		OPAREN=36, CPAREN=37, OBRACE=38, CBRACE=39, COMMA=40, TERMINATOR=41, VARIABLE=42, 
		NUMBER=43, NEWLINE=44, SLCMNT=45, MLCMNT=46, WS=47;
	public static final int
		RULE_bc = 0, RULE_code = 1, RULE_statement = 2, RULE_function = 3, RULE_return_stat = 4, 
		RULE_loop_stat = 5, RULE_func_call = 6, RULE_print_stat = 7, RULE_if_else = 8, 
		RULE_while_loop = 9, RULE_for_loop = 10, RULE_block = 11, RULE_math_expr = 12, 
		RULE_expression = 13, RULE_atomic = 14, RULE_var = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"bc", "code", "statement", "function", "return_stat", "loop_stat", "func_call", 
			"print_stat", "if_else", "while_loop", "for_loop", "block", "math_expr", 
			"expression", "atomic", "var"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'scale'", "'read'", "'print'", "'last'", "'&&'", "'||'", "'!'", 
			"'++'", "'--'", "'+'", "'-'", "'/'", "'*'", "'%'", "'^'", "'='", "'<'", 
			"'>'", "'<='", "'>='", "'=='", "'!='", "'sqrt'", "'s'", "'c'", "'l'", 
			"'e'", "'if'", "'else'", "'for'", "'while'", "'define'", "'break'", "'continue'", 
			"'return'", "'('", "')'", "'{'", "'}'", "','", "';'", null, null, "'\r\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCALE", "READ", "PRINT", "LAST", "AND", "OR", "NOT", "INC", "DEC", 
			"PLUS", "MINUS", "DIV", "MUL", "MOD", "POW", "EQUAL", "LT", "GT", "LTEQ", 
			"GTEQ", "EQEQ", "NOTEQ", "SQRT", "SIN", "COS", "LOG", "EXP", "IF", "ELSE", 
			"FOR", "WHILE", "DEFINE", "BREAK", "CONTINUE", "RETURN", "OPAREN", "CPAREN", 
			"OBRACE", "CBRACE", "COMMA", "TERMINATOR", "VARIABLE", "NUMBER", "NEWLINE", 
			"SLCMNT", "MLCMNT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "bc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BcContext extends ParserRuleContext {
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public TerminalNode EOF() { return getToken(bcParser.EOF, 0); }
		public BcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterBc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitBc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitBc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BcContext bc() throws RecognitionException {
		BcContext _localctx = new BcContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_bc);
		int _la;
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCALE:
			case READ:
			case PRINT:
			case NOT:
			case INC:
			case DEC:
			case MINUS:
			case SQRT:
			case SIN:
			case COS:
			case LOG:
			case EXP:
			case IF:
			case FOR:
			case WHILE:
			case DEFINE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case OPAREN:
			case VARIABLE:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(32);
					code();
					}
					}
					setState(35); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCALE) | (1L << READ) | (1L << PRINT) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << MINUS) | (1L << SQRT) | (1L << SIN) | (1L << COS) | (1L << LOG) | (1L << EXP) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DEFINE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << OPAREN) | (1L << VARIABLE) | (1L << NUMBER))) != 0) );
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(EOF);
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

	public static class CodeContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCALE:
			case READ:
			case PRINT:
			case NOT:
			case INC:
			case DEC:
			case MINUS:
			case SQRT:
			case SIN:
			case COS:
			case LOG:
			case EXP:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case OPAREN:
			case VARIABLE:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				statement(0);
				}
				break;
			case DEFINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				function();
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

	public static class StatementContext extends ParserRuleContext {
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Loop_statContext loop_stat() {
			return getRuleContext(Loop_statContext.class,0);
		}
		public Return_statContext return_stat() {
			return getRuleContext(Return_statContext.class,0);
		}
		public Print_statContext print_stat() {
			return getRuleContext(Print_statContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(bcParser.TERMINATOR, 0); }
		public TerminalNode NEWLINE() { return getToken(bcParser.NEWLINE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		return statement(0);
	}

	private StatementContext statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementContext _localctx = new StatementContext(_ctx, _parentState);
		StatementContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_statement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCALE:
			case READ:
			case NOT:
			case INC:
			case DEC:
			case MINUS:
			case SQRT:
			case SIN:
			case COS:
			case LOG:
			case EXP:
			case OPAREN:
			case VARIABLE:
			case NUMBER:
				{
				setState(45);
				math_expr();
				}
				break;
			case IF:
				{
				setState(46);
				if_else();
				}
				break;
			case WHILE:
				{
				setState(47);
				while_loop();
				}
				break;
			case FOR:
				{
				setState(48);
				for_loop();
				}
				break;
			case BREAK:
			case CONTINUE:
				{
				setState(49);
				loop_stat();
				}
				break;
			case RETURN:
				{
				setState(50);
				return_stat();
				}
				break;
			case PRINT:
				{
				setState(51);
				print_stat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(58);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new StatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(54);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(55);
						match(TERMINATOR);
						}
						break;
					case 2:
						{
						_localctx = new StatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(56);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(57);
						match(NEWLINE);
						}
						break;
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(bcParser.DEFINE, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(bcParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(bcParser.VARIABLE, i);
		}
		public TerminalNode OPAREN() { return getToken(bcParser.OPAREN, 0); }
		public TerminalNode CPAREN() { return getToken(bcParser.CPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(bcParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(bcParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(DEFINE);
			setState(64);
			match(VARIABLE);
			setState(65);
			match(OPAREN);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(66);
						match(VARIABLE);
						setState(67);
						match(COMMA);
						}
						} 
					}
					setState(72);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(73);
				match(VARIABLE);
				}
			}

			setState(76);
			match(CPAREN);
			setState(77);
			block();
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

	public static class Return_statContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(bcParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterReturn_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitReturn_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitReturn_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statContext return_stat() throws RecognitionException {
		Return_statContext _localctx = new Return_statContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_return_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(RETURN);
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(80);
				expression(0);
				}
				break;
			}
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

	public static class Loop_statContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(bcParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(bcParser.CONTINUE, 0); }
		public Loop_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterLoop_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitLoop_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitLoop_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statContext loop_stat() throws RecognitionException {
		Loop_statContext _localctx = new Loop_statContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loop_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !(_la==BREAK || _la==CONTINUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(bcParser.VARIABLE, 0); }
		public TerminalNode OPAREN() { return getToken(bcParser.OPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CPAREN() { return getToken(bcParser.CPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(bcParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(bcParser.COMMA, i);
		}
		public TerminalNode TERMINATOR() { return getToken(bcParser.TERMINATOR, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func_call);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(VARIABLE);
			setState(86);
			match(OPAREN);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					expression(0);
					setState(88);
					match(COMMA);
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(95);
			expression(0);
			setState(96);
			match(CPAREN);
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(97);
				match(TERMINATOR);
				}
				break;
			}
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

	public static class Print_statContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(bcParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(bcParser.COMMA, 0); }
		public Print_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterPrint_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitPrint_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitPrint_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statContext print_stat() throws RecognitionException {
		Print_statContext _localctx = new Print_statContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(PRINT);
			setState(101);
			expression(0);
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(102);
				match(COMMA);
				}
				break;
			}
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

	public static class If_elseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(bcParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(bcParser.ELSE, 0); }
		public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterIf_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitIf_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitIf_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(IF);
			setState(106);
			expression(0);
			setState(107);
			block();
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(108);
				match(ELSE);
				setState(109);
				block();
				}
				break;
			}
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(bcParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(WHILE);
			setState(113);
			expression(0);
			setState(114);
			block();
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(bcParser.FOR, 0); }
		public TerminalNode OPAREN() { return getToken(bcParser.OPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> TERMINATOR() { return getTokens(bcParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(bcParser.TERMINATOR, i);
		}
		public TerminalNode CPAREN() { return getToken(bcParser.CPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(FOR);
			setState(117);
			match(OPAREN);
			setState(118);
			expression(0);
			setState(119);
			match(TERMINATOR);
			setState(120);
			expression(0);
			setState(121);
			match(TERMINATOR);
			setState(122);
			expression(0);
			setState(123);
			match(CPAREN);
			setState(124);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(bcParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(bcParser.CBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode TERMINATOR() { return getToken(bcParser.TERMINATOR, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(OBRACE);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCALE) | (1L << READ) | (1L << PRINT) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << MINUS) | (1L << SQRT) | (1L << SIN) | (1L << COS) | (1L << LOG) | (1L << EXP) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << OPAREN) | (1L << VARIABLE) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(127);
				statement(0);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(CBRACE);
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(134);
				match(TERMINATOR);
				}
				break;
			}
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

	public static class Math_exprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Math_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterMath_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitMath_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitMath_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_exprContext math_expr() throws RecognitionException {
		Math_exprContext _localctx = new Math_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_math_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncExprContext extends ExpressionContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public FuncExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadExprContext extends ExpressionContext {
		public TerminalNode READ() { return getToken(bcParser.READ, 0); }
		public TerminalNode OPAREN() { return getToken(bcParser.OPAREN, 0); }
		public TerminalNode CPAREN() { return getToken(bcParser.CPAREN, 0); }
		public ReadExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterReadExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitReadExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitReadExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExpressionContext {
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public AtomExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(bcParser.OR, 0); }
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(bcParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(bcParser.MINUS, 0); }
		public AdditiveExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(bcParser.LT, 0); }
		public TerminalNode GT() { return getToken(bcParser.GT, 0); }
		public TerminalNode LTEQ() { return getToken(bcParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(bcParser.GTEQ, 0); }
		public TerminalNode EQEQ() { return getToken(bcParser.EQEQ, 0); }
		public TerminalNode NOTEQ() { return getToken(bcParser.NOTEQ, 0); }
		public RelationalExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarExprContext extends ExpressionContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(bcParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathFuncExprContext extends ExpressionContext {
		public Token op;
		public TerminalNode OPAREN() { return getToken(bcParser.OPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CPAREN() { return getToken(bcParser.CPAREN, 0); }
		public TerminalNode SQRT() { return getToken(bcParser.SQRT, 0); }
		public TerminalNode SIN() { return getToken(bcParser.SIN, 0); }
		public TerminalNode COS() { return getToken(bcParser.COS, 0); }
		public TerminalNode LOG() { return getToken(bcParser.LOG, 0); }
		public TerminalNode EXP() { return getToken(bcParser.EXP, 0); }
		public MathFuncExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterMathFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitMathFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitMathFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScaleExprContext extends ExpressionContext {
		public TerminalNode SCALE() { return getToken(bcParser.SCALE, 0); }
		public TerminalNode EQUAL() { return getToken(bcParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ScaleExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterScaleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitScaleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitScaleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(bcParser.POW, 0); }
		public PowExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitPowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(bcParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(bcParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(bcParser.MOD, 0); }
		public MultiplicativeExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitMultiplicativeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitMultiplicativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(bcParser.AND, 0); }
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new FuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(140);
				func_call();
				}
				break;
			case 2:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				var();
				}
				break;
			case 3:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(NOT);
				setState(143);
				expression(7);
				}
				break;
			case 4:
				{
				_localctx = new MathFuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				((MathFuncExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQRT) | (1L << SIN) | (1L << COS) | (1L << LOG) | (1L << EXP))) != 0)) ) {
					((MathFuncExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(145);
				match(OPAREN);
				setState(146);
				expression(0);
				setState(147);
				match(CPAREN);
				}
				break;
			case 5:
				{
				_localctx = new ScaleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(SCALE);
				setState(150);
				match(EQUAL);
				setState(151);
				expression(3);
				}
				break;
			case 6:
				{
				_localctx = new ReadExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(READ);
				setState(153);
				match(OPAREN);
				setState(154);
				match(CPAREN);
				}
				break;
			case 7:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				atomic();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(176);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(158);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(159);
						match(POW);
						setState(160);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(161);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(162);
						((MultiplicativeExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MUL) | (1L << MOD))) != 0)) ) {
							((MultiplicativeExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(163);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(164);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(165);
						((AdditiveExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(166);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(167);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(168);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LTEQ) | (1L << GTEQ) | (1L << EQEQ) | (1L << NOTEQ))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(169);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(170);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(171);
						match(AND);
						setState(172);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(173);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(174);
						match(OR);
						setState(175);
						expression(6);
						}
						break;
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomicContext extends ParserRuleContext {
		public AtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic; }
	 
		public AtomicContext() { }
		public void copyFrom(AtomicContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberContext extends AtomicContext {
		public TerminalNode NUMBER() { return getToken(bcParser.NUMBER, 0); }
		public NumberContext(AtomicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusNumberContext extends AtomicContext {
		public TerminalNode MINUS() { return getToken(bcParser.MINUS, 0); }
		public TerminalNode NUMBER() { return getToken(bcParser.NUMBER, 0); }
		public MinusNumberContext(AtomicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterMinusNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitMinusNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitMinusNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenContext extends AtomicContext {
		public TerminalNode OPAREN() { return getToken(bcParser.OPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CPAREN() { return getToken(bcParser.CPAREN, 0); }
		public ParenContext(AtomicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicContext atomic() throws RecognitionException {
		AtomicContext _localctx = new AtomicContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atomic);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(NUMBER);
				}
				break;
			case MINUS:
				_localctx = new MinusNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(MINUS);
				setState(183);
				match(NUMBER);
				}
				break;
			case OPAREN:
				_localctx = new ParenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(OPAREN);
				setState(185);
				expression(0);
				setState(186);
				match(CPAREN);
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

	public static class VarContext extends ParserRuleContext {
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	 
		public VarContext() { }
		public void copyFrom(VarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PreOpVariableExprContext extends VarContext {
		public Token op;
		public TerminalNode VARIABLE() { return getToken(bcParser.VARIABLE, 0); }
		public TerminalNode INC() { return getToken(bcParser.INC, 0); }
		public TerminalNode DEC() { return getToken(bcParser.DEC, 0); }
		public PreOpVariableExprContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterPreOpVariableExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitPreOpVariableExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitPreOpVariableExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExprContext extends VarContext {
		public TerminalNode MINUS() { return getToken(bcParser.MINUS, 0); }
		public TerminalNode VARIABLE() { return getToken(bcParser.VARIABLE, 0); }
		public UnaryMinusExprContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterUnaryMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitUnaryMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitUnaryMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends VarContext {
		public TerminalNode VARIABLE() { return getToken(bcParser.VARIABLE, 0); }
		public VariableContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticAssignExprContext extends VarContext {
		public Token op;
		public TerminalNode VARIABLE() { return getToken(bcParser.VARIABLE, 0); }
		public TerminalNode EQUAL() { return getToken(bcParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(bcParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(bcParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(bcParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(bcParser.MINUS, 0); }
		public TerminalNode MOD() { return getToken(bcParser.MOD, 0); }
		public TerminalNode POW() { return getToken(bcParser.POW, 0); }
		public ArithmeticAssignExprContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterArithmeticAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitArithmeticAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitArithmeticAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends VarContext {
		public TerminalNode VARIABLE() { return getToken(bcParser.VARIABLE, 0); }
		public TerminalNode EQUAL() { return getToken(bcParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignExprContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostOpVariableExprContext extends VarContext {
		public Token op;
		public TerminalNode VARIABLE() { return getToken(bcParser.VARIABLE, 0); }
		public TerminalNode INC() { return getToken(bcParser.INC, 0); }
		public TerminalNode DEC() { return getToken(bcParser.DEC, 0); }
		public PostOpVariableExprContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterPostOpVariableExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitPostOpVariableExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitPostOpVariableExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_var);
		int _la;
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(VARIABLE);
				}
				break;
			case 2:
				_localctx = new PreOpVariableExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				((PreOpVariableExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
					((PreOpVariableExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(192);
				match(VARIABLE);
				}
				break;
			case 3:
				_localctx = new PostOpVariableExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(VARIABLE);
				setState(194);
				((PostOpVariableExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
					((PostOpVariableExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				_localctx = new UnaryMinusExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(MINUS);
				setState(196);
				match(VARIABLE);
				}
				break;
			case 5:
				_localctx = new ArithmeticAssignExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				match(VARIABLE);
				setState(198);
				((ArithmeticAssignExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MUL) | (1L << MOD) | (1L << POW))) != 0)) ) {
					((ArithmeticAssignExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(199);
				match(EQUAL);
				setState(200);
				expression(0);
				}
				break;
			case 6:
				_localctx = new AssignExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				match(VARIABLE);
				setState(202);
				match(EQUAL);
				setState(203);
				expression(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return statement_sempred((StatementContext)_localctx, predIndex);
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00d1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2"+
		"$\n\2\r\2\16\2%\3\2\5\2)\n\2\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\67\n\4\3\4\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\5\3\5\3"+
		"\5\3\5\3\5\7\5G\n\5\f\5\16\5J\13\5\3\5\5\5M\n\5\3\5\3\5\3\5\3\6\3\6\5"+
		"\6T\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b]\n\b\f\b\16\b`\13\b\3\b\3\b\3"+
		"\b\5\be\n\b\3\t\3\t\3\t\5\tj\n\t\3\n\3\n\3\n\3\n\3\n\5\nq\n\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\r\u0083\n"+
		"\r\f\r\16\r\u0086\13\r\3\r\3\r\5\r\u008a\n\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u009f\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00b3\n\17\f\17\16\17\u00b6\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00bf\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00cf\n\21"+
		"\3\21\2\4\6\34\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\t\3\2#$\3"+
		"\2\31\35\3\2\16\20\3\2\f\r\3\2\23\30\3\2\n\13\3\2\f\21\2\u00e7\2(\3\2"+
		"\2\2\4,\3\2\2\2\6\66\3\2\2\2\bA\3\2\2\2\nQ\3\2\2\2\fU\3\2\2\2\16W\3\2"+
		"\2\2\20f\3\2\2\2\22k\3\2\2\2\24r\3\2\2\2\26v\3\2\2\2\30\u0080\3\2\2\2"+
		"\32\u008b\3\2\2\2\34\u009e\3\2\2\2\36\u00be\3\2\2\2 \u00ce\3\2\2\2\"$"+
		"\5\4\3\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&)\3\2\2\2\')\7\2\2\3"+
		"(#\3\2\2\2(\'\3\2\2\2)\3\3\2\2\2*-\5\6\4\2+-\5\b\5\2,*\3\2\2\2,+\3\2\2"+
		"\2-\5\3\2\2\2./\b\4\1\2/\67\5\32\16\2\60\67\5\22\n\2\61\67\5\24\13\2\62"+
		"\67\5\26\f\2\63\67\5\f\7\2\64\67\5\n\6\2\65\67\5\20\t\2\66.\3\2\2\2\66"+
		"\60\3\2\2\2\66\61\3\2\2\2\66\62\3\2\2\2\66\63\3\2\2\2\66\64\3\2\2\2\66"+
		"\65\3\2\2\2\67>\3\2\2\289\f\4\2\29=\7+\2\2:;\f\3\2\2;=\7.\2\2<8\3\2\2"+
		"\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\7\3\2\2\2@>\3\2\2\2AB\7\""+
		"\2\2BC\7,\2\2CL\7&\2\2DE\7,\2\2EG\7*\2\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2"+
		"HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KM\7,\2\2LH\3\2\2\2LM\3\2\2\2MN\3\2\2\2"+
		"NO\7\'\2\2OP\5\30\r\2P\t\3\2\2\2QS\7%\2\2RT\5\34\17\2SR\3\2\2\2ST\3\2"+
		"\2\2T\13\3\2\2\2UV\t\2\2\2V\r\3\2\2\2WX\7,\2\2X^\7&\2\2YZ\5\34\17\2Z["+
		"\7*\2\2[]\3\2\2\2\\Y\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2"+
		"`^\3\2\2\2ab\5\34\17\2bd\7\'\2\2ce\7+\2\2dc\3\2\2\2de\3\2\2\2e\17\3\2"+
		"\2\2fg\7\5\2\2gi\5\34\17\2hj\7*\2\2ih\3\2\2\2ij\3\2\2\2j\21\3\2\2\2kl"+
		"\7\36\2\2lm\5\34\17\2mp\5\30\r\2no\7\37\2\2oq\5\30\r\2pn\3\2\2\2pq\3\2"+
		"\2\2q\23\3\2\2\2rs\7!\2\2st\5\34\17\2tu\5\30\r\2u\25\3\2\2\2vw\7 \2\2"+
		"wx\7&\2\2xy\5\34\17\2yz\7+\2\2z{\5\34\17\2{|\7+\2\2|}\5\34\17\2}~\7\'"+
		"\2\2~\177\5\30\r\2\177\27\3\2\2\2\u0080\u0084\7(\2\2\u0081\u0083\5\6\4"+
		"\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\7)\2\2\u0088"+
		"\u008a\7+\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\31\3\2\2\2"+
		"\u008b\u008c\5\34\17\2\u008c\33\3\2\2\2\u008d\u008e\b\17\1\2\u008e\u009f"+
		"\5\16\b\2\u008f\u009f\5 \21\2\u0090\u0091\7\t\2\2\u0091\u009f\5\34\17"+
		"\t\u0092\u0093\t\3\2\2\u0093\u0094\7&\2\2\u0094\u0095\5\34\17\2\u0095"+
		"\u0096\7\'\2\2\u0096\u009f\3\2\2\2\u0097\u0098\7\3\2\2\u0098\u0099\7\22"+
		"\2\2\u0099\u009f\5\34\17\5\u009a\u009b\7\4\2\2\u009b\u009c\7&\2\2\u009c"+
		"\u009f\7\'\2\2\u009d\u009f\5\36\20\2\u009e\u008d\3\2\2\2\u009e\u008f\3"+
		"\2\2\2\u009e\u0090\3\2\2\2\u009e\u0092\3\2\2\2\u009e\u0097\3\2\2\2\u009e"+
		"\u009a\3\2\2\2\u009e\u009d\3\2\2\2\u009f\u00b4\3\2\2\2\u00a0\u00a1\f\r"+
		"\2\2\u00a1\u00a2\7\21\2\2\u00a2\u00b3\5\34\17\16\u00a3\u00a4\f\f\2\2\u00a4"+
		"\u00a5\t\4\2\2\u00a5\u00b3\5\34\17\r\u00a6\u00a7\f\13\2\2\u00a7\u00a8"+
		"\t\5\2\2\u00a8\u00b3\5\34\17\f\u00a9\u00aa\f\n\2\2\u00aa\u00ab\t\6\2\2"+
		"\u00ab\u00b3\5\34\17\13\u00ac\u00ad\f\b\2\2\u00ad\u00ae\7\7\2\2\u00ae"+
		"\u00b3\5\34\17\t\u00af\u00b0\f\7\2\2\u00b0\u00b1\7\b\2\2\u00b1\u00b3\5"+
		"\34\17\b\u00b2\u00a0\3\2\2\2\u00b2\u00a3\3\2\2\2\u00b2\u00a6\3\2\2\2\u00b2"+
		"\u00a9\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3\u00b6\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\35\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b7\u00bf\7-\2\2\u00b8\u00b9\7\r\2\2\u00b9\u00bf\7-\2\2\u00ba"+
		"\u00bb\7&\2\2\u00bb\u00bc\5\34\17\2\u00bc\u00bd\7\'\2\2\u00bd\u00bf\3"+
		"\2\2\2\u00be\u00b7\3\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf"+
		"\37\3\2\2\2\u00c0\u00cf\7,\2\2\u00c1\u00c2\t\7\2\2\u00c2\u00cf\7,\2\2"+
		"\u00c3\u00c4\7,\2\2\u00c4\u00cf\t\7\2\2\u00c5\u00c6\7\r\2\2\u00c6\u00cf"+
		"\7,\2\2\u00c7\u00c8\7,\2\2\u00c8\u00c9\t\b\2\2\u00c9\u00ca\7\22\2\2\u00ca"+
		"\u00cf\5\34\17\2\u00cb\u00cc\7,\2\2\u00cc\u00cd\7\22\2\2\u00cd\u00cf\5"+
		"\34\17\2\u00ce\u00c0\3\2\2\2\u00ce\u00c1\3\2\2\2\u00ce\u00c3\3\2\2\2\u00ce"+
		"\u00c5\3\2\2\2\u00ce\u00c7\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf!\3\2\2\2"+
		"\26%(,\66<>HLS^dip\u0084\u0089\u009e\u00b2\u00b4\u00be\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}