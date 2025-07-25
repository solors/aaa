package com.smaato.sdk.video.vast.parser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.core.util.p574fi.Predicate;
import com.smaato.sdk.video.p577fi.CheckedFunction;
import com.smaato.sdk.video.p577fi.NonNullConsumer;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class RegistryXmlParser {
    @NonNull
    private static final CheckedFunction<String, Boolean> booleanAttributeConvertion = new CheckedFunction() { // from class: com.smaato.sdk.video.vast.parser.u4
        @Override // com.smaato.sdk.video.p577fi.CheckedFunction
        public final Object apply(Object obj) {
            Boolean lambda$static$0;
            lambda$static$0 = RegistryXmlParser.lambda$static$0((String) obj);
            return lambda$static$0;
        }
    };
    @NonNull
    private final Map<String, XmlClassParser> parsers;
    @NonNull
    private final XmlPullParser xmlPullParser;

    public RegistryXmlParser(@NonNull XmlPullParser xmlPullParser, @NonNull Map<String, XmlClassParser> map) {
        this.xmlPullParser = (XmlPullParser) Objects.requireNonNull(xmlPullParser);
        this.parsers = (Map) Objects.requireNonNull(map);
    }

    private <Type> void acceptOrSkip(@NonNull NonNullConsumer<Type> nonNullConsumer, @NonNull Type type) throws Exception {
        try {
            nonNullConsumer.accept(type);
        } catch (Exception e) {
            skipToEndTag();
            throw e;
        }
    }

    private static boolean containsIn(@NonNull final String str, @NonNull String[] strArr) {
        if (!TextUtils.isEmpty(str)) {
            List asList = Arrays.asList(strArr);
            java.util.Objects.requireNonNull(str);
            if (Lists.any(asList, new Predicate() { // from class: com.smaato.sdk.video.vast.parser.r4
                @Override // com.smaato.sdk.core.util.p574fi.Predicate
                public final boolean test(Object obj) {
                    return str.equalsIgnoreCase((String) obj);
                }
            })) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void lambda$parseTypedAttribute$2(String str, Exception exc, Consumer consumer) {
        consumer.accept(ParseError.buildFrom(str, exc));
    }

    public static /* synthetic */ void lambda$parseTypedAttribute$3(String str, String str2, Consumer consumer) {
        consumer.accept(ParseError.buildFrom(str, new VastElementMissingException(str2)));
    }

    public static /* synthetic */ Boolean lambda$static$0(String str) throws Exception {
        if (str.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (str.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        throw new ParsingCoverterException("Cannot convert: \"" + str + "\" to boolean");
    }

    @NonNull
    public RegistryXmlParser parseBooleanAttribute(@NonNull String str, @NonNull Consumer<Boolean> consumer, @NonNull Consumer<ParseError> consumer2) {
        return parseTypedAttribute(str, booleanAttributeConvertion, consumer, consumer2);
    }

    @NonNull
    public <Result> RegistryXmlParser parseClass(@NonNull String str, @NonNull NonNullConsumer<ParseResult<Result>> nonNullConsumer) {
        Objects.requireNonNull(str);
        XmlClassParser xmlClassParser = this.parsers.get(str);
        try {
            if (xmlClassParser == null) {
                nonNullConsumer.accept(ParseResult.error(str, new NullPointerException("XmlClassParser for " + str + " is not found")));
                skip();
            } else {
                acceptOrSkip(nonNullConsumer, xmlClassParser.parse(this));
            }
        } catch (Exception e) {
            nonNullConsumer.accept(ParseResult.error(str, new Exception("Exception while parsing " + str, e)));
        }
        return this;
    }

    @NonNull
    public RegistryXmlParser parseFloatAttribute(@NonNull String str, @NonNull Consumer<Float> consumer, @NonNull Consumer<ParseError> consumer2) {
        return parseTypedAttribute(str, new CheckedFunction() { // from class: com.smaato.sdk.video.vast.parser.t4
            @Override // com.smaato.sdk.video.p577fi.CheckedFunction
            public final Object apply(Object obj) {
                return Float.valueOf(Float.parseFloat((String) obj));
            }
        }, consumer, consumer2);
    }

    @NonNull
    public RegistryXmlParser parseIntegerAttribute(@NonNull String str, @NonNull Consumer<Integer> consumer, @NonNull Consumer<ParseError> consumer2) {
        return parseTypedAttribute(str, new CheckedFunction() { // from class: com.smaato.sdk.video.vast.parser.q4
            @Override // com.smaato.sdk.video.p577fi.CheckedFunction
            public final Object apply(Object obj) {
                return Integer.valueOf(Integer.parseInt((String) obj));
            }
        }, consumer, consumer2);
    }

    @NonNull
    public RegistryXmlParser parseString(@NonNull Consumer<String> consumer, @NonNull Consumer<Exception> consumer2) {
        try {
            String str = null;
            if (this.xmlPullParser.next() == 4) {
                String text = this.xmlPullParser.getText();
                if (text != null) {
                    str = text.trim();
                }
                this.xmlPullParser.nextTag();
            }
            consumer.accept(str);
        } catch (IOException | XmlPullParserException e) {
            consumer2.accept(e);
        }
        return this;
    }

    @NonNull
    public RegistryXmlParser parseStringAttribute(@NonNull String str, @NonNull Consumer<String> consumer, @NonNull Consumer<ParseError> consumer2) {
        return parseTypedAttribute(str, new CheckedFunction() { // from class: com.smaato.sdk.video.vast.parser.s4
            @Override // com.smaato.sdk.video.p577fi.CheckedFunction
            public final Object apply(Object obj) {
                String lambda$parseStringAttribute$1;
                lambda$parseStringAttribute$1 = RegistryXmlParser.lambda$parseStringAttribute$1((String) obj);
                return lambda$parseStringAttribute$1;
            }
        }, consumer, consumer2);
    }

    @NonNull
    public RegistryXmlParser parseTags(@NonNull String[] strArr, @NonNull Consumer<String> consumer, @NonNull Consumer<Exception> consumer2) {
        while (this.xmlPullParser.next() != 3) {
            try {
                if (this.xmlPullParser.getEventType() != 1) {
                    if (this.xmlPullParser.getEventType() == 2) {
                        String name = this.xmlPullParser.getName();
                        if (containsIn(name, strArr)) {
                            consumer.accept(name);
                        } else {
                            skip();
                        }
                    }
                } else {
                    throw new XmlPullParserException("XML END tag is missing");
                }
            } catch (IOException | XmlPullParserException e) {
                consumer2.accept(e);
            }
        }
        return this;
    }

    @NonNull
    public <Result> RegistryXmlParser parseTypedAttribute(@NonNull final String str, @NonNull CheckedFunction<String, Result> checkedFunction, @NonNull Consumer<Result> consumer, @NonNull Consumer<ParseError> consumer2) {
        int attributeCount = this.xmlPullParser.getAttributeCount();
        String str2 = null;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = this.xmlPullParser.getAttributeName(i);
            if (str.equalsIgnoreCase(attributeName)) {
                str2 = this.xmlPullParser.getAttributeValue(null, attributeName);
            }
        }
        if (str2 != null) {
            try {
                consumer.accept(checkedFunction.apply(str2));
            } catch (Exception e) {
                Objects.onNotNull(consumer2, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.v4
                    @Override // com.smaato.sdk.core.util.p574fi.Consumer
                    public final void accept(Object obj) {
                        RegistryXmlParser.lambda$parseTypedAttribute$2(str, e, (Consumer) obj);
                    }
                });
            }
        } else {
            final String str3 = "No attribute found for name: " + str;
            Objects.onNotNull(consumer2, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.w4
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    RegistryXmlParser.lambda$parseTypedAttribute$3(str, str3, (Consumer) obj);
                }
            });
        }
        return this;
    }

    @NonNull
    public RegistryXmlParser prepare(@NonNull InputStream inputStream, @Nullable String str) throws XmlPullParserException, IOException {
        Objects.requireNonNull(inputStream);
        str = (TextUtils.isEmpty(str) || !XmlEncodingUtils.isSupported(str)) ? null : null;
        this.xmlPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        this.xmlPullParser.setInput(inputStream, str);
        this.xmlPullParser.nextTag();
        return this;
    }

    public <T> void registerParser(@NonNull String str, @NonNull XmlClassParser<T> xmlClassParser) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(xmlClassParser);
        this.parsers.put(str, xmlClassParser);
    }

    public void skip() throws XmlPullParserException, IOException {
        if (this.xmlPullParser.getEventType() == 2) {
            skipToEndTag();
            return;
        }
        throw new IllegalStateException();
    }

    public void skipToEndTag() throws XmlPullParserException, IOException {
        int i = 1;
        while (i != 0) {
            int next = this.xmlPullParser.next();
            if (next != 1) {
                if (next != 2) {
                    if (next == 3) {
                        i--;
                    }
                } else {
                    i++;
                }
            } else if (i > 0) {
                throw new XmlPullParserException("XML END tag is missing");
            }
        }
    }

    public static /* synthetic */ String lambda$parseStringAttribute$1(String str) throws Exception {
        return str;
    }
}
