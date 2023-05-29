// Generated from Calculadora.g4 by ANTLR 4.13.0

    package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculadoraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, NUM=11, STRING=12, SUM_OPERATOR=13, MUL_OPERATOR=14, COMPARATION_OPERATOR=15, 
		WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"ID", "NUM", "STRING", "SUM_OPERATOR", "MUL_OPERATOR", "COMPARATION_OPERATOR", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'{'", "'}'", "'if'", "'='", "'= Input('", "')'", "'Print('", 
			"'('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ID", "NUM", 
			"STRING", "SUM_OPERATOR", "MUL_OPERATOR", "COMPARATION_OPERATOR", "WS"
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


	public CalculadoraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculadora.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0010j\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0004\tF\b\t\u000b\t\f\tG\u0001\t\u0005\tK\b\t\n\t\f\tN\t\t\u0001"+
		"\n\u0004\nQ\b\n\u000b\n\f\nR\u0001\u000b\u0001\u000b\u0004\u000bW\b\u000b"+
		"\u000b\u000b\f\u000bX\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000ee"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0000\u0010"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010\u0001\u0000\u0007\u0001\u0000az\u0004\u00000"+
		"9AZ__az\u0001\u000009\u0004\u0000  09AZaz\u0002\u0000++--\u0003\u0000"+
		"%%**//\u0003\u0000\t\n\r\r  n\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000"+
		"\u0000\u0000\u0005)\u0001\u0000\u0000\u0000\u0007+\u0001\u0000\u0000\u0000"+
		"\t.\u0001\u0000\u0000\u0000\u000b0\u0001\u0000\u0000\u0000\r9\u0001\u0000"+
		"\u0000\u0000\u000f;\u0001\u0000\u0000\u0000\u0011B\u0001\u0000\u0000\u0000"+
		"\u0013E\u0001\u0000\u0000\u0000\u0015P\u0001\u0000\u0000\u0000\u0017T"+
		"\u0001\u0000\u0000\u0000\u0019\\\u0001\u0000\u0000\u0000\u001b^\u0001"+
		"\u0000\u0000\u0000\u001dd\u0001\u0000\u0000\u0000\u001ff\u0001\u0000\u0000"+
		"\u0000!\"\u0005w\u0000\u0000\"#\u0005h\u0000\u0000#$\u0005i\u0000\u0000"+
		"$%\u0005l\u0000\u0000%&\u0005e\u0000\u0000&\u0002\u0001\u0000\u0000\u0000"+
		"\'(\u0005{\u0000\u0000(\u0004\u0001\u0000\u0000\u0000)*\u0005}\u0000\u0000"+
		"*\u0006\u0001\u0000\u0000\u0000+,\u0005i\u0000\u0000,-\u0005f\u0000\u0000"+
		"-\b\u0001\u0000\u0000\u0000./\u0005=\u0000\u0000/\n\u0001\u0000\u0000"+
		"\u000001\u0005=\u0000\u000012\u0005 \u0000\u000023\u0005I\u0000\u0000"+
		"34\u0005n\u0000\u000045\u0005p\u0000\u000056\u0005u\u0000\u000067\u0005"+
		"t\u0000\u000078\u0005(\u0000\u00008\f\u0001\u0000\u0000\u00009:\u0005"+
		")\u0000\u0000:\u000e\u0001\u0000\u0000\u0000;<\u0005P\u0000\u0000<=\u0005"+
		"r\u0000\u0000=>\u0005i\u0000\u0000>?\u0005n\u0000\u0000?@\u0005t\u0000"+
		"\u0000@A\u0005(\u0000\u0000A\u0010\u0001\u0000\u0000\u0000BC\u0005(\u0000"+
		"\u0000C\u0012\u0001\u0000\u0000\u0000DF\u0007\u0000\u0000\u0000ED\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HL\u0001\u0000\u0000\u0000IK\u0007\u0001\u0000"+
		"\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000M\u0014\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000OQ\u0007\u0002\u0000\u0000PO\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000S\u0016\u0001\u0000\u0000\u0000TV\u0005\"\u0000\u0000UW\u0007"+
		"\u0003\u0000\u0000VU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z[\u0005\"\u0000\u0000[\u0018\u0001\u0000\u0000\u0000\\]\u0007\u0004"+
		"\u0000\u0000]\u001a\u0001\u0000\u0000\u0000^_\u0007\u0005\u0000\u0000"+
		"_\u001c\u0001\u0000\u0000\u0000`a\u0005=\u0000\u0000ae\u0005=\u0000\u0000"+
		"bc\u0005!\u0000\u0000ce\u0005=\u0000\u0000d`\u0001\u0000\u0000\u0000d"+
		"b\u0001\u0000\u0000\u0000e\u001e\u0001\u0000\u0000\u0000fg\u0007\u0006"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0006\u000f\u0000\u0000i \u0001"+
		"\u0000\u0000\u0000\u0006\u0000GLRXd\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}