package com.smaato.sdk.richmedia.p575ad;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.mvvm.model.AdResponse;
import com.smaato.sdk.core.mvvm.model.AdResponseParser;
import com.smaato.sdk.core.p568ad.AdType;
import com.smaato.sdk.core.util.HeaderValueUtils;
import com.smaato.sdk.core.util.Jsons;
import com.smaato.sdk.core.util.TextUtils;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import net.pubnative.lite.sdk.vpaid.enums.EventConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.smaato.sdk.richmedia.ad.RichMediaAdResponseParser */
/* loaded from: classes7.dex */
public class RichMediaAdResponseParser extends AdResponseParser {
    @NonNull
    private final Logger logger;

    public RichMediaAdResponseParser(@NonNull HeaderValueUtils headerValueUtils, @NonNull Logger logger) {
        super(AdType.RICH_MEDIA, headerValueUtils);
        this.logger = logger;
    }

    private void checkForMissingFields(AdResponse adResponse) {
        if (adResponse.getRichMediaContent() != null) {
            if (!adResponse.getImpressionTrackingUrls().isEmpty()) {
                if (!adResponse.getClickTrackingUrls().isEmpty()) {
                    return;
                }
                throw new IllegalStateException("clickTrackingUrls cannot be empty");
            }
            throw new IllegalStateException("impressionTrackingUrls cannot be empty for rich media ad");
        }
        throw new IllegalStateException("Missing content for rich media ad");
    }

    private Integer parseTimeInterval(String str) throws ParseException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date parse = simpleDateFormat.parse(str);
        if (parse != null) {
            return Integer.valueOf((int) (parse.getTime() / 1000));
        }
        throw new ParseException("Cannot parse time string: " + str, 0);
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponseParser
    protected AdResponse parseResponse(AdResponse.Builder builder, String str, long j) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("richmedia");
            List<String> stringList = Jsons.toStringList(jSONObject.getJSONArray("impressiontrackers"));
            List<String> stringList2 = Jsons.toStringList(jSONObject.getJSONArray(POBNativeConstants.NATIVE_CLICK_TRACKER));
            JSONObject jSONObject2 = jSONObject.getJSONObject("mediadata");
            builder.setRichMediaContent(jSONObject2.getString("content")).setWidth(Integer.valueOf(Integer.parseInt(jSONObject2.getString(POBNativeConstants.NATIVE_IMAGE_WIDTH)))).setHeight(Integer.valueOf(Integer.parseInt(jSONObject2.getString("h")))).setImpressionTrackingUrls(stringList).setClickTrackingUrls(stringList2).setRichMediaRewardIntervalSeconds(parseTimeInterval(jSONObject2.optString(EventConstants.SKIP)));
            AdResponse build = builder.build();
            checkForMissingFields(build);
            return build;
        } catch (NumberFormatException e) {
            e = e;
            String format = String.format("Invalid markup: %s", str);
            this.logger.error(LogDomain.AD, e, format, new Object[0]);
            throw new AdResponseParser.ParsingException(format, e);
        } catch (JSONException e2) {
            e = e2;
            String format2 = String.format("Invalid markup: %s", str);
            this.logger.error(LogDomain.AD, e, format2, new Object[0]);
            throw new AdResponseParser.ParsingException(format2, e);
        } catch (Exception e3) {
            this.logger.error(LogDomain.AD, e3, "Cannot build RichMediaAdResponse due to validation error", new Object[0]);
            throw new AdResponseParser.ParsingException("Cannot build RichMediaAdResponse due to validation error", e3);
        }
    }
}
