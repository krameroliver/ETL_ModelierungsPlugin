package org.etl_modeling.etldsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalETLDslLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalETLDslLexer() {;} 
    public InternalETLDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalETLDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalETLDsl.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:11:7: ( 'true' )
            // InternalETLDsl.g:11:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:12:7: ( 'false' )
            // InternalETLDsl.g:12:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:13:7: ( 'STAGE' )
            // InternalETLDsl.g:13:9: 'STAGE'
            {
            match("STAGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:14:7: ( 'INTEGRATION' )
            // InternalETLDsl.g:14:9: 'INTEGRATION'
            {
            match("INTEGRATION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:15:7: ( 'EXPORT' )
            // InternalETLDsl.g:15:9: 'EXPORT'
            {
            match("EXPORT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:16:7: ( 'REPORTING' )
            // InternalETLDsl.g:16:9: 'REPORTING'
            {
            match("REPORTING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:17:7: ( 'HARMONISATION' )
            // InternalETLDsl.g:17:9: 'HARMONISATION'
            {
            match("HARMONISATION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:18:7: ( 'NONE' )
            // InternalETLDsl.g:18:9: 'NONE'
            {
            match("NONE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:19:7: ( 'DAY_PARTITIONED' )
            // InternalETLDsl.g:19:9: 'DAY_PARTITIONED'
            {
            match("DAY_PARTITIONED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:20:7: ( 'MONTH_PARTITIONED' )
            // InternalETLDsl.g:20:9: 'MONTH_PARTITIONED'
            {
            match("MONTH_PARTITIONED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:21:7: ( 'BITEMPORAL' )
            // InternalETLDsl.g:21:9: 'BITEMPORAL'
            {
            match("BITEMPORAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:22:7: ( 'FLAT_TABLE' )
            // InternalETLDsl.g:22:9: 'FLAT_TABLE'
            {
            match("FLAT_TABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:23:7: ( 'ThirdNF' )
            // InternalETLDsl.g:23:9: 'ThirdNF'
            {
            match("ThirdNF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:24:7: ( 'SNOWFLAKE' )
            // InternalETLDsl.g:24:9: 'SNOWFLAKE'
            {
            match("SNOWFLAKE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:25:7: ( 'STAR' )
            // InternalETLDsl.g:25:9: 'STAR'
            {
            match("STAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:26:7: ( 'String' )
            // InternalETLDsl.g:26:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:27:7: ( 'Date' )
            // InternalETLDsl.g:27:9: 'Date'
            {
            match("Date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:28:7: ( 'Decimal' )
            // InternalETLDsl.g:28:9: 'Decimal'
            {
            match("Decimal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:29:7: ( 'HK' )
            // InternalETLDsl.g:29:9: 'HK'
            {
            match("HK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:30:7: ( 'Int' )
            // InternalETLDsl.g:30:9: 'Int'
            {
            match("Int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:31:7: ( 'TimeStamp' )
            // InternalETLDsl.g:31:9: 'TimeStamp'
            {
            match("TimeStamp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:32:7: ( 'TrueFalse' )
            // InternalETLDsl.g:32:9: 'TrueFalse'
            {
            match("TrueFalse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:33:7: ( 'logpackage' )
            // InternalETLDsl.g:33:9: 'logpackage'
            {
            match("logpackage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:34:7: ( 'LAYER' )
            // InternalETLDsl.g:34:9: 'LAYER'
            {
            match("LAYER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:35:7: ( 'LAYER_TYPE' )
            // InternalETLDsl.g:35:9: 'LAYER_TYPE'
            {
            match("LAYER_TYPE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:36:7: ( 'HISTORISATION' )
            // InternalETLDsl.g:36:9: 'HISTORISATION'
            {
            match("HISTORISATION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:37:7: ( 'REPRESENTATION' )
            // InternalETLDsl.g:37:9: 'REPRESENTATION'
            {
            match("REPRESENTATION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:38:7: ( ',' )
            // InternalETLDsl.g:38:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:39:7: ( 'commonmapping' )
            // InternalETLDsl.g:39:9: 'commonmapping'
            {
            match("commonmapping"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:40:7: ( '{' )
            // InternalETLDsl.g:40:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:41:7: ( '}' )
            // InternalETLDsl.g:41:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:42:7: ( 'InputField' )
            // InternalETLDsl.g:42:9: 'InputField'
            {
            match("InputField"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:43:7: ( 'OutputField' )
            // InternalETLDsl.g:43:9: 'OutputField'
            {
            match("OutputField"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:44:7: ( 'Entity' )
            // InternalETLDsl.g:44:9: 'Entity'
            {
            match("Entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:45:7: ( 'entityFields' )
            // InternalETLDsl.g:45:9: 'entityFields'
            {
            match("entityFields"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:46:7: ( 'INCLUDES' )
            // InternalETLDsl.g:46:9: 'INCLUDES'
            {
            match("INCLUDES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:47:7: ( '[' )
            // InternalETLDsl.g:47:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:48:7: ( ']' )
            // InternalETLDsl.g:48:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:49:7: ( 'Relationship' )
            // InternalETLDsl.g:49:9: 'Relationship'
            {
            match("Relationship"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:50:7: ( 'Field' )
            // InternalETLDsl.g:50:9: 'Field'
            {
            match("Field"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:51:7: ( 'type' )
            // InternalETLDsl.g:51:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:52:7: ( 'length' )
            // InternalETLDsl.g:52:9: 'length'
            {
            match("length"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:53:7: ( 'precision' )
            // InternalETLDsl.g:53:9: 'precision'
            {
            match("precision"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:54:7: ( 'scale' )
            // InternalETLDsl.g:54:9: 'scale'
            {
            match("scale"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:55:7: ( 'original_name' )
            // InternalETLDsl.g:55:9: 'original_name'
            {
            match("original_name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:56:7: ( 'short_describtion' )
            // InternalETLDsl.g:56:9: 'short_describtion'
            {
            match("short_describtion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:57:7: ( 'dateFormat' )
            // InternalETLDsl.g:57:9: 'dateFormat'
            {
            match("dateFormat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:58:7: ( 'NullIndicator' )
            // InternalETLDsl.g:58:9: 'NullIndicator'
            {
            match("NullIndicator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:59:7: ( 'allowExponent:' )
            // InternalETLDsl.g:59:9: 'allowExponent:'
            {
            match("allowExponent:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:60:7: ( 'hasImplicitComma:' )
            // InternalETLDsl.g:60:9: 'hasImplicitComma:'
            {
            match("hasImplicitComma:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:61:7: ( 'interfaceOnly:' )
            // InternalETLDsl.g:61:9: 'interfaceOnly:'
            {
            match("interfaceOnly:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:62:7: ( 'tableOnly:' )
            // InternalETLDsl.g:62:9: 'tableOnly:'
            {
            match("tableOnly:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:63:7: ( 'isFastChanging:' )
            // InternalETLDsl.g:63:9: 'isFastChanging:'
            {
            match("isFastChanging:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:64:7: ( '.' )
            // InternalETLDsl.g:64:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:65:7: ( '-' )
            // InternalETLDsl.g:65:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:66:7: ( 'FROM: ' )
            // InternalETLDsl.g:66:9: 'FROM: '
            {
            match("FROM: "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:67:7: ( 'To: ' )
            // InternalETLDsl.g:67:9: 'To: '
            {
            match("To: "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:68:7: ( 'DescribingFields:{' )
            // InternalETLDsl.g:68:9: 'DescribingFields:{'
            {
            match("DescribingFields:{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:69:7: ( 'IdentifyingFields:{' )
            // InternalETLDsl.g:69:9: 'IdentifyingFields:{'
            {
            match("IdentifyingFields:{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:5020:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalETLDsl.g:5020:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalETLDsl.g:5020:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalETLDsl.g:5020:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalETLDsl.g:5020:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalETLDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:5022:10: ( ( '0' .. '9' )+ )
            // InternalETLDsl.g:5022:12: ( '0' .. '9' )+
            {
            // InternalETLDsl.g:5022:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalETLDsl.g:5022:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:5024:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalETLDsl.g:5024:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalETLDsl.g:5024:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalETLDsl.g:5024:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalETLDsl.g:5024:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalETLDsl.g:5024:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalETLDsl.g:5024:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalETLDsl.g:5024:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalETLDsl.g:5024:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalETLDsl.g:5024:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalETLDsl.g:5024:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:5026:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalETLDsl.g:5026:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalETLDsl.g:5026:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalETLDsl.g:5026:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:5028:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalETLDsl.g:5028:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalETLDsl.g:5028:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalETLDsl.g:5028:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalETLDsl.g:5028:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalETLDsl.g:5028:41: ( '\\r' )? '\\n'
                    {
                    // InternalETLDsl.g:5028:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalETLDsl.g:5028:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:5030:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalETLDsl.g:5030:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalETLDsl.g:5030:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalETLDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalETLDsl.g:5032:16: ( . )
            // InternalETLDsl.g:5032:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalETLDsl.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=66;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalETLDsl.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalETLDsl.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalETLDsl.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalETLDsl.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalETLDsl.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalETLDsl.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalETLDsl.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalETLDsl.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalETLDsl.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalETLDsl.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalETLDsl.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalETLDsl.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalETLDsl.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalETLDsl.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalETLDsl.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalETLDsl.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalETLDsl.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalETLDsl.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalETLDsl.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalETLDsl.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalETLDsl.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalETLDsl.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalETLDsl.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalETLDsl.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalETLDsl.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalETLDsl.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalETLDsl.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalETLDsl.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalETLDsl.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalETLDsl.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalETLDsl.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalETLDsl.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalETLDsl.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalETLDsl.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalETLDsl.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalETLDsl.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalETLDsl.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalETLDsl.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalETLDsl.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalETLDsl.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalETLDsl.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalETLDsl.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalETLDsl.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalETLDsl.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalETLDsl.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalETLDsl.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalETLDsl.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalETLDsl.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalETLDsl.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalETLDsl.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalETLDsl.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalETLDsl.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalETLDsl.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalETLDsl.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalETLDsl.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // InternalETLDsl.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // InternalETLDsl.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // InternalETLDsl.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // InternalETLDsl.g:1:358: T__69
                {
                mT__69(); 

                }
                break;
            case 60 :
                // InternalETLDsl.g:1:364: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 61 :
                // InternalETLDsl.g:1:372: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 62 :
                // InternalETLDsl.g:1:381: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 63 :
                // InternalETLDsl.g:1:393: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 64 :
                // InternalETLDsl.g:1:409: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 65 :
                // InternalETLDsl.g:1:425: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 66 :
                // InternalETLDsl.g:1:433: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\17\54\1\uffff\1\54\2\uffff\2\54\2\uffff\7\54\2\uffff\1\50\2\uffff\3\50\2\uffff\3\54\1\uffff\14\54\1\165\22\54\1\uffff\1\54\2\uffff\2\54\2\uffff\11\54\7\uffff\11\54\1\u009f\7\54\1\uffff\17\54\1\uffff\17\54\1\u00c6\1\u00c7\3\54\1\u00cb\4\54\1\uffff\11\54\1\u00d9\2\54\1\u00dc\31\54\2\uffff\1\54\1\u00f7\1\u00f8\1\uffff\15\54\1\uffff\2\54\1\uffff\5\54\1\u010d\1\uffff\5\54\1\u0114\4\54\1\u0119\10\54\2\uffff\1\54\1\u0123\4\54\1\u0128\1\u0129\14\54\1\uffff\4\54\1\u013a\1\54\1\uffff\4\54\1\uffff\11\54\1\uffff\4\54\2\uffff\7\54\1\u0154\4\54\1\u0159\3\54\1\uffff\17\54\1\u016c\11\54\1\uffff\4\54\1\uffff\20\54\1\u018a\1\54\1\uffff\2\54\1\u018e\12\54\1\u0199\1\u019a\5\54\1\u01a0\7\54\2\uffff\1\54\1\u01a9\1\54\1\uffff\10\54\1\u01b3\1\u01b4\2\uffff\1\u01b5\1\u01b6\3\54\1\uffff\2\54\1\u01bc\4\54\1\u01c1\1\uffff\11\54\4\uffff\1\54\1\u01cc\3\54\1\uffff\4\54\1\uffff\2\54\1\u01d6\7\54\1\uffff\1\u01de\10\54\1\uffff\1\u01e7\1\u01e8\1\u01e9\3\54\1\u01ed\1\uffff\1\54\1\u01ef\5\54\1\u01f5\3\uffff\3\54\1\uffff\1\54\2\uffff\1\54\1\uffff\2\54\1\uffff\1\u01fd\4\54\1\uffff\1\54\1\uffff\5\54\1\uffff\1\u0208\1\u0209\4\uffff";
    static final String DFA12_eofS =
        "\u020a\uffff";
    static final String DFA12_minS =
        "\1\0\2\141\2\116\1\130\1\105\1\101\1\117\1\101\1\117\1\111\1\114\1\150\1\145\1\101\1\uffff\1\157\2\uffff\1\165\1\156\2\uffff\1\162\1\143\1\162\1\141\1\154\1\141\1\156\2\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\165\1\160\1\142\1\uffff\1\154\1\101\1\117\1\162\1\103\1\160\1\145\1\120\1\164\1\120\1\154\1\122\1\60\1\123\1\116\1\154\1\131\1\164\1\143\1\116\1\124\1\101\1\145\1\117\1\151\1\155\1\165\1\72\1\147\1\156\1\131\1\uffff\1\155\2\uffff\2\164\2\uffff\1\145\1\141\1\157\1\151\1\164\1\154\1\163\1\164\1\106\7\uffff\2\145\1\154\1\163\1\107\1\127\1\151\1\105\1\114\1\60\1\165\1\156\1\117\1\151\1\117\1\141\1\115\1\uffff\1\124\1\105\1\154\1\137\1\145\1\151\1\143\1\124\1\105\1\124\1\154\1\115\1\162\2\145\1\uffff\1\160\1\147\1\105\1\155\1\160\1\151\1\143\1\154\1\162\1\147\1\145\1\157\1\111\1\145\1\141\2\60\2\145\1\105\1\60\1\106\1\156\1\107\1\125\1\uffff\2\164\1\122\1\164\1\122\1\105\1\164\2\117\1\60\1\111\1\120\1\60\1\155\1\162\1\110\1\115\1\137\1\144\1\72\1\144\1\123\1\106\1\141\1\164\1\122\1\157\1\165\1\164\1\151\1\145\1\164\1\151\1\106\1\167\1\155\1\162\1\163\2\uffff\1\117\2\60\1\uffff\1\114\1\147\1\122\1\104\1\106\1\151\1\124\1\171\1\124\1\123\1\151\1\116\1\122\1\uffff\1\156\1\101\1\uffff\1\141\1\151\1\137\1\120\1\124\1\60\1\uffff\1\116\1\164\1\141\1\143\1\150\1\60\1\156\1\164\1\171\1\163\1\60\1\137\1\156\1\157\1\105\1\160\1\146\1\164\1\156\2\uffff\1\101\1\60\1\101\1\105\1\151\1\146\2\60\1\111\1\105\1\157\2\111\1\144\1\122\1\154\1\142\1\120\1\117\1\101\1\uffff\1\106\1\141\1\154\1\153\1\60\1\124\1\uffff\1\155\2\106\1\151\1\uffff\1\144\1\141\1\162\1\170\1\154\1\141\1\103\1\154\1\113\1\uffff\1\124\1\123\1\145\1\171\2\uffff\2\116\1\156\2\123\1\151\1\124\1\60\1\151\1\101\1\122\1\102\1\60\1\155\1\163\1\141\1\uffff\1\131\1\141\2\151\1\157\1\145\1\154\1\155\1\160\1\151\1\143\1\150\1\171\1\105\1\111\1\60\1\154\1\151\1\107\1\124\1\163\2\101\1\143\1\111\1\uffff\1\156\1\122\1\101\1\114\1\uffff\1\160\1\145\1\147\1\120\1\160\2\145\1\156\1\163\1\137\1\141\1\157\1\143\1\145\1\141\1\72\1\60\1\117\1\uffff\1\144\1\156\1\60\1\101\1\150\2\124\1\141\1\124\1\147\1\124\1\114\1\105\2\60\1\145\1\105\1\160\2\154\1\60\1\143\1\156\1\164\1\156\1\151\1\117\1\156\2\uffff\1\116\1\60\1\147\1\uffff\1\124\1\151\2\111\1\164\1\111\1\106\1\111\2\60\2\uffff\2\60\1\151\2\144\1\uffff\1\162\1\141\1\60\1\145\1\164\1\156\1\147\1\60\1\uffff\1\106\1\111\1\160\2\117\1\157\1\117\1\151\1\124\4\uffff\1\156\1\60\1\163\1\151\1\155\1\uffff\1\156\1\103\1\154\1\151\1\uffff\1\151\1\117\1\60\2\116\1\162\1\116\1\145\1\111\1\147\1\uffff\1\60\1\142\1\145\1\164\1\157\1\171\1\156\1\145\1\116\1\uffff\3\60\1\105\1\154\1\117\1\60\1\uffff\1\164\1\60\1\72\1\155\1\72\1\147\1\154\1\60\3\uffff\1\104\1\144\1\116\1\uffff\1\151\2\uffff\1\155\1\uffff\1\72\1\144\1\uffff\1\60\1\163\1\105\1\157\1\141\1\uffff\1\163\1\uffff\1\72\1\104\1\156\2\72\1\uffff\2\60\4\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\171\1\141\1\164\2\156\1\145\1\113\1\165\1\145\1\117\1\111\1\151\1\162\1\157\1\101\1\uffff\1\157\2\uffff\1\165\1\156\2\uffff\1\162\1\150\1\162\1\141\1\154\1\141\1\163\2\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\165\1\160\1\142\1\uffff\1\154\1\101\1\117\1\162\1\124\1\164\1\145\1\120\1\164\1\120\1\154\1\122\1\172\1\123\1\116\1\154\1\131\1\164\1\163\1\116\1\124\1\101\1\145\1\117\1\151\1\155\1\165\1\72\1\147\1\156\1\131\1\uffff\1\155\2\uffff\2\164\2\uffff\1\145\1\141\1\157\1\151\1\164\1\154\1\163\1\164\1\106\7\uffff\2\145\1\154\1\163\1\122\1\127\1\151\1\105\1\114\1\172\1\165\1\156\1\117\1\151\1\122\1\141\1\115\1\uffff\1\124\1\105\1\154\1\137\1\145\1\151\1\143\1\124\1\105\1\124\1\154\1\115\1\162\2\145\1\uffff\1\160\1\147\1\105\1\155\1\160\1\151\1\143\1\154\1\162\1\147\1\145\1\157\1\111\1\145\1\141\2\172\2\145\1\105\1\172\1\106\1\156\1\107\1\125\1\uffff\2\164\1\122\1\164\1\122\1\105\1\164\2\117\1\172\1\111\1\120\1\172\1\155\1\162\1\110\1\115\1\137\1\144\1\72\1\144\1\123\1\106\1\141\1\164\1\122\1\157\1\165\1\164\1\151\1\145\1\164\1\151\1\106\1\167\1\155\1\162\1\163\2\uffff\1\117\2\172\1\uffff\1\114\1\147\1\122\1\104\1\106\1\151\1\124\1\171\1\124\1\123\1\151\1\116\1\122\1\uffff\1\156\1\101\1\uffff\1\141\1\151\1\137\1\120\1\124\1\172\1\uffff\1\116\1\164\1\141\1\143\1\150\1\172\1\156\1\164\1\171\1\163\1\172\1\137\1\156\1\157\1\105\1\160\1\146\1\164\1\156\2\uffff\1\101\1\172\1\101\1\105\1\151\1\146\2\172\1\111\1\105\1\157\2\111\1\144\1\122\1\154\1\142\1\120\1\117\1\101\1\uffff\1\106\1\141\1\154\1\153\1\172\1\124\1\uffff\1\155\2\106\1\151\1\uffff\1\144\1\141\1\162\1\170\1\154\1\141\1\103\1\154\1\113\1\uffff\1\124\1\123\1\145\1\171\2\uffff\2\116\1\156\2\123\1\151\1\124\1\172\1\151\1\101\1\122\1\102\1\172\1\155\1\163\1\141\1\uffff\1\131\1\141\2\151\1\157\1\145\1\154\1\155\1\160\1\151\1\143\1\150\1\171\1\105\1\111\1\172\1\154\1\151\1\107\1\124\1\163\2\101\1\143\1\111\1\uffff\1\156\1\122\1\101\1\114\1\uffff\1\160\1\145\1\147\1\120\1\160\2\145\1\156\1\163\1\137\1\141\1\157\1\143\1\145\1\141\1\72\1\172\1\117\1\uffff\1\144\1\156\1\172\1\101\1\150\2\124\1\141\1\124\1\147\1\124\1\114\1\105\2\172\1\145\1\105\1\160\2\154\1\172\1\143\1\156\1\164\1\156\1\151\1\117\1\156\2\uffff\1\116\1\172\1\147\1\uffff\1\124\1\151\2\111\1\164\1\111\1\106\1\111\2\172\2\uffff\2\172\1\151\2\144\1\uffff\1\162\1\141\1\172\1\145\1\164\1\156\1\147\1\172\1\uffff\1\106\1\111\1\160\2\117\1\157\1\117\1\151\1\124\4\uffff\1\156\1\172\1\163\1\151\1\155\1\uffff\1\156\1\103\1\154\1\151\1\uffff\1\151\1\117\1\172\2\116\1\162\1\116\1\145\1\111\1\147\1\uffff\1\172\1\142\1\145\1\164\1\157\1\171\1\156\1\145\1\116\1\uffff\3\172\1\105\1\154\1\117\1\172\1\uffff\1\164\1\172\1\72\1\155\1\72\1\147\1\154\1\172\3\uffff\1\104\1\144\1\116\1\uffff\1\151\2\uffff\1\155\1\uffff\1\72\1\144\1\uffff\1\172\1\163\1\105\1\157\1\141\1\uffff\1\163\1\uffff\1\72\1\104\1\156\2\72\1\uffff\2\172\4\uffff";
    static final String DFA12_acceptS =
        "\20\uffff\1\34\1\uffff\1\36\1\37\2\uffff\1\45\1\46\7\uffff\1\66\1\67\1\uffff\1\74\1\75\3\uffff\1\101\1\102\3\uffff\1\74\37\uffff\1\34\1\uffff\1\36\1\37\2\uffff\1\45\1\46\11\uffff\1\66\1\67\1\75\1\76\1\77\1\100\1\101\21\uffff\1\23\17\uffff\1\71\31\uffff\1\24\46\uffff\1\1\1\51\3\uffff\1\17\15\uffff\1\10\2\uffff\1\21\6\uffff\1\70\23\uffff\1\2\1\3\24\uffff\1\50\6\uffff\1\30\4\uffff\1\54\11\uffff\1\20\4\uffff\1\5\1\42\20\uffff\1\52\31\uffff\1\22\4\uffff\1\15\22\uffff\1\44\34\uffff\1\64\1\16\3\uffff\1\6\12\uffff\1\25\1\26\5\uffff\1\53\10\uffff\1\40\11\uffff\1\13\1\14\1\27\1\31\5\uffff\1\57\4\uffff\1\4\12\uffff\1\41\11\uffff\1\47\7\uffff\1\43\10\uffff\1\7\1\32\1\60\3\uffff\1\35\1\uffff\1\55\1\61\1\uffff\1\63\2\uffff\1\33\5\uffff\1\65\1\uffff\1\11\5\uffff\1\72\2\uffff\1\62\1\73\1\12\1\56";
    static final String DFA12_specialS =
        "\1\1\43\uffff\1\2\1\0\u01e4\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\50\2\47\2\50\1\47\22\50\1\47\1\50\1\44\4\50\1\45\4\50\1\20\1\40\1\37\1\46\12\43\7\50\1\42\1\13\1\42\1\11\1\5\1\14\1\42\1\7\1\4\2\42\1\17\1\12\1\10\1\24\2\42\1\6\1\3\1\15\6\42\1\26\1\50\1\27\1\41\1\42\1\50\1\34\1\42\1\21\1\33\1\25\1\2\1\42\1\35\1\36\2\42\1\16\2\42\1\32\1\30\2\42\1\31\1\1\6\42\1\22\1\50\1\23\uff82\50",
            "\1\53\20\uffff\1\51\6\uffff\1\52",
            "\1\55",
            "\1\57\5\uffff\1\56\37\uffff\1\60",
            "\1\61\25\uffff\1\63\11\uffff\1\62",
            "\1\64\25\uffff\1\65",
            "\1\66\37\uffff\1\67",
            "\1\70\7\uffff\1\72\1\uffff\1\71",
            "\1\73\45\uffff\1\74",
            "\1\75\37\uffff\1\76\3\uffff\1\77",
            "\1\100",
            "\1\101",
            "\1\102\5\uffff\1\104\26\uffff\1\103",
            "\1\105\1\106\5\uffff\1\110\2\uffff\1\107",
            "\1\112\11\uffff\1\111",
            "\1\113",
            "",
            "\1\115",
            "",
            "",
            "\1\120",
            "\1\121",
            "",
            "",
            "\1\124",
            "\1\125\4\uffff\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133\4\uffff\1\134",
            "",
            "",
            "\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\0\140",
            "\0\140",
            "\1\141\4\uffff\1\142",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\154\20\uffff\1\153",
            "\1\156\3\uffff\1\155",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173\17\uffff\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "\1\u0089",
            "",
            "",
            "\1\u008a",
            "\1\u008b",
            "",
            "",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099\12\uffff\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4\2\uffff\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00da",
            "\1\u00db",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "",
            "\1\u00f6",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "",
            "\1\u0106",
            "\1\u0107",
            "",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\12\54\7\uffff\32\54\4\uffff\1\u0113\1\uffff\32\54",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "",
            "",
            "\1\u0122",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u013b",
            "",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "",
            "",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u018b",
            "",
            "\1\u018c",
            "\1\u018d",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "",
            "",
            "\1\u01a8",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01aa",
            "",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "",
            "\1\u01ba",
            "\1\u01bb",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "",
            "",
            "",
            "",
            "\1\u01cb",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "",
            "\1\u01d4",
            "\1\u01d5",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u01ee",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "",
            "\1\u01f9",
            "",
            "",
            "\1\u01fa",
            "",
            "\1\u01fb",
            "\1\u01fc",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "",
            "\1\u0202",
            "",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_37 = input.LA(1);

                        s = -1;
                        if ( ((LA12_37>='\u0000' && LA12_37<='\uFFFF')) ) {s = 96;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='t') ) {s = 1;}

                        else if ( (LA12_0=='f') ) {s = 2;}

                        else if ( (LA12_0=='S') ) {s = 3;}

                        else if ( (LA12_0=='I') ) {s = 4;}

                        else if ( (LA12_0=='E') ) {s = 5;}

                        else if ( (LA12_0=='R') ) {s = 6;}

                        else if ( (LA12_0=='H') ) {s = 7;}

                        else if ( (LA12_0=='N') ) {s = 8;}

                        else if ( (LA12_0=='D') ) {s = 9;}

                        else if ( (LA12_0=='M') ) {s = 10;}

                        else if ( (LA12_0=='B') ) {s = 11;}

                        else if ( (LA12_0=='F') ) {s = 12;}

                        else if ( (LA12_0=='T') ) {s = 13;}

                        else if ( (LA12_0=='l') ) {s = 14;}

                        else if ( (LA12_0=='L') ) {s = 15;}

                        else if ( (LA12_0==',') ) {s = 16;}

                        else if ( (LA12_0=='c') ) {s = 17;}

                        else if ( (LA12_0=='{') ) {s = 18;}

                        else if ( (LA12_0=='}') ) {s = 19;}

                        else if ( (LA12_0=='O') ) {s = 20;}

                        else if ( (LA12_0=='e') ) {s = 21;}

                        else if ( (LA12_0=='[') ) {s = 22;}

                        else if ( (LA12_0==']') ) {s = 23;}

                        else if ( (LA12_0=='p') ) {s = 24;}

                        else if ( (LA12_0=='s') ) {s = 25;}

                        else if ( (LA12_0=='o') ) {s = 26;}

                        else if ( (LA12_0=='d') ) {s = 27;}

                        else if ( (LA12_0=='a') ) {s = 28;}

                        else if ( (LA12_0=='h') ) {s = 29;}

                        else if ( (LA12_0=='i') ) {s = 30;}

                        else if ( (LA12_0=='.') ) {s = 31;}

                        else if ( (LA12_0=='-') ) {s = 32;}

                        else if ( (LA12_0=='^') ) {s = 33;}

                        else if ( (LA12_0=='A'||LA12_0=='C'||LA12_0=='G'||(LA12_0>='J' && LA12_0<='K')||(LA12_0>='P' && LA12_0<='Q')||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||LA12_0=='g'||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='m' && LA12_0<='n')||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='u' && LA12_0<='z')) ) {s = 34;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 35;}

                        else if ( (LA12_0=='\"') ) {s = 36;}

                        else if ( (LA12_0=='\'') ) {s = 37;}

                        else if ( (LA12_0=='/') ) {s = 38;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 39;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>=':' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 40;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_36 = input.LA(1);

                        s = -1;
                        if ( ((LA12_36>='\u0000' && LA12_36<='\uFFFF')) ) {s = 96;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}