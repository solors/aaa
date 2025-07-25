package com.smaato.sdk.video.vast.parser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.p577fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.VastTree;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class VastResponseParser {
    @NonNull
    private final RegistryXmlParser xmlPullParser;

    public VastResponseParser(@NonNull RegistryXmlParser registryXmlParser) {
        this.xmlPullParser = (RegistryXmlParser) Objects.requireNonNull(registryXmlParser, "Parameter xmlPullParser cannot be null for VastResponseParser::new");
    }

    public void parseVastResponse(@NonNull Logger logger, @NonNull InputStream inputStream, @Nullable String str, @NonNull NonNullConsumer<ParseResult<VastTree>> nonNullConsumer) {
        Objects.requireNonNull(logger);
        Objects.requireNonNull(inputStream);
        Objects.requireNonNull(nonNullConsumer);
        try {
            this.xmlPullParser.prepare(inputStream, str).parseClass(VastTree.VAST, nonNullConsumer);
        } catch (IOException e) {
            e = e;
            nonNullConsumer.accept(ParseResult.error(VastTree.VAST, e));
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            nonNullConsumer.accept(ParseResult.error(VastTree.VAST, e));
        } catch (AssertionError unused) {
            nonNullConsumer.accept(ParseResult.error(VastTree.VAST, new Exception("AssertionError")));
        } catch (XmlPullParserException e3) {
            e = e3;
            nonNullConsumer.accept(ParseResult.error(VastTree.VAST, e));
        } catch (Exception unused2) {
            nonNullConsumer.accept(ParseResult.error(VastTree.VAST, new Exception("Exception while parsing the xml")));
        }
    }
}
