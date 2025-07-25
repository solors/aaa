package com.smaato.sdk.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.Headers;
import com.smaato.sdk.core.p568ad.AdFormat;
import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes7.dex */
public class HeaderValueUtils {
    @NonNull
    Logger logger;

    /* renamed from: com.smaato.sdk.core.util.HeaderValueUtils$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C27296a {

        /* renamed from: a */
        static final /* synthetic */ int[] f71932a;

        static {
            int[] iArr = new int[AdFormat.values().length];
            f71932a = iArr;
            try {
                iArr[AdFormat.DISPLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71932a[AdFormat.STATIC_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71932a[AdFormat.RICH_MEDIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71932a[AdFormat.VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71932a[AdFormat.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71932a[AdFormat.INTERSTITIAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public HeaderValueUtils(@NonNull Logger logger) {
        this.logger = logger;
    }

    @Nullable
    private Long decodeHeaderDate(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            Date parse = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", new Locale("en", "US", "POSIX")).parse(str);
            if (parse == null) {
                return null;
            }
            return Long.valueOf(parse.getTime());
        } catch (ParseException e) {
            this.logger.error(LogDomain.CORE, "date parse error", e);
            return null;
        }
    }

    @Nullable
    private String getAdTypeHeaderValue(Headers headers) {
        List<String> values = headers.values("X-SMT-ADTYPE");
        if (values.isEmpty()) {
            return null;
        }
        return values.get(0);
    }

    private String getCsmHeaderValue(Headers headers) {
        String join = Joiner.join("", headers.values("X-SMT-CSM"));
        if (join.isEmpty()) {
            this.logger.debug(LogDomain.CORE, "No X-SMT-CSM header in ad response. null is returned.", new Object[0]);
            return null;
        }
        return join;
    }

    private ImpressionCountingType getImpressionCountingType(String str) {
        if (str != null) {
            return ImpressionCountingType.VIEWABLE;
        }
        this.logger.debug(LogDomain.CORE, "No X-SMT-Impression-Measurement header in ad response. Using standard impression type.", new Object[0]);
        return ImpressionCountingType.STANDARD;
    }

    @Nullable
    private String getImpressionTypeHeaderValue(Headers headers) {
        List<String> values = headers.values("X-SMT-Impression-Measurement");
        if (values.isEmpty()) {
            return null;
        }
        return values.get(0);
    }

    @Nullable
    private String parseCharset(@NonNull List<String> list) {
        String parseCharset;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            if (str != null && (parseCharset = ContentTypeUtil.parseCharset(str)) != null) {
                this.logger.debug(LogDomain.CORE, "charset found in response = %s", parseCharset);
                return parseCharset;
            }
        }
        this.logger.debug(LogDomain.CORE, "charset not found in response", new Object[0]);
        return null;
    }

    @NonNull
    public String adFormatToApiValue(@NonNull AdFormat adFormat) {
        switch (C27296a.f71932a[adFormat.ordinal()]) {
            case 1:
                return "display";
            case 2:
                return POBNativeConstants.NATIVE_IMAGE;
            case 3:
                return "richmedia";
            case 4:
                return "video";
            case 5:
                return "native";
            case 6:
                return "interstitial";
            default:
                String format = String.format("Unexpected %s: %s", AdFormat.class.getSimpleName(), adFormat);
                this.logger.error(LogDomain.CORE, format, new Object[0]);
                throw new IllegalArgumentException(format);
        }
    }

    @Nullable
    public AdFormat getAdFormat(Headers headers) {
        String adTypeHeaderValue = getAdTypeHeaderValue(headers);
        String csmHeaderValue = getCsmHeaderValue(headers);
        if (adTypeHeaderValue == null && csmHeaderValue == null) {
            this.logger.debug(LogDomain.CORE, "missing %s response header", "X-SMT-ADTYPE");
            return null;
        } else if (adTypeHeaderValue == null) {
            return AdFormat.CSM;
        } else {
            Logger logger = this.logger;
            LogDomain logDomain = LogDomain.CORE;
            logger.debug(logDomain, "%s header value: %s", "X-SMT-ADTYPE", adTypeHeaderValue);
            if (adTypeHeaderValue.isEmpty()) {
                this.logger.debug(logDomain, "invalid %s response header value", "X-SMT-ADTYPE");
                return null;
            }
            return getAdFormatForAdFormatHeaderField(adTypeHeaderValue);
        }
    }

    @Nullable
    public AdFormat getAdFormatForAdFormatHeaderField(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1968751561:
                if (str.equals("Native")) {
                    c = 0;
                    break;
                }
                break;
            case -884608380:
                if (str.equals("NativeVideo")) {
                    c = 1;
                    break;
                }
                break;
            case 73635:
                if (str.equals("Img")) {
                    c = 2;
                    break;
                }
                break;
            case 82650203:
                if (str.equals(Constants.VIDEO)) {
                    c = 3;
                    break;
                }
                break;
            case 1173835880:
                if (str.equals("Richmedia")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return AdFormat.NATIVE;
            case 2:
                return AdFormat.STATIC_IMAGE;
            case 3:
                return AdFormat.VIDEO;
            case 4:
                return AdFormat.RICH_MEDIA;
            default:
                this.logger.debug(LogDomain.CORE, "unexpected X-SMT-ADTYPE response header value: %s", str);
                return null;
        }
    }

    public String getCharSet(Headers headers) {
        List<String> values = headers.values("Content-Type");
        if (values.isEmpty()) {
            this.logger.debug(LogDomain.CORE, "%s header is absent in response", "Content-Type");
            return null;
        }
        return parseCharset(values);
    }

    public long getTtl(@NonNull Headers headers) {
        long longValue;
        List<String> values = headers.values("X-SMT-Expires");
        if (!values.isEmpty()) {
            try {
                long parseLong = Long.parseLong(values.get(0));
                List<String> values2 = headers.values("Date");
                if (values2.isEmpty()) {
                    return parseLong - System.currentTimeMillis();
                }
                Long decodeHeaderDate = decodeHeaderDate(values2.get(0));
                if (decodeHeaderDate == null) {
                    longValue = System.currentTimeMillis();
                } else {
                    longValue = decodeHeaderDate.longValue();
                }
                return parseLong - longValue;
            } catch (NumberFormatException e) {
                this.logger.error(LogDomain.CORE, "Error when parsing TTL in header", e);
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    @Nullable
    public String retrieveBundleId(@NonNull Headers headers) {
        List<String> values = headers.values("X-SMT-BUNDLE");
        if (values.isEmpty()) {
            return null;
        }
        return values.get(0);
    }

    @Nullable
    public String retrieveImpressionCountingType(@NonNull Headers headers) {
        List<String> values = headers.values("X-SMT-Impression-Measurement");
        if (values.isEmpty()) {
            return null;
        }
        return values.get(0);
    }

    @NonNull
    public ImpressionCountingType retrieveImpressionType(@NonNull Headers headers) {
        return getImpressionCountingType(getImpressionTypeHeaderValue(headers));
    }

    @Nullable
    public String retrieveSci(@NonNull Headers headers) {
        List<String> values = headers.values("SCI");
        if (values.isEmpty()) {
            return null;
        }
        return Joiner.join("", values);
    }

    @Nullable
    public String retrieveSessionId(@NonNull Headers headers) {
        List<String> values = headers.values("X-SMT-SessionId");
        if (values.isEmpty()) {
            return null;
        }
        return Joiner.join("", values);
    }

    @Nullable
    public ImpressionCountingType retrieveImpressionType(@NonNull Map<String, List<String>> map) {
        List<String> list = map.get("X-SMT-Impression-Measurement");
        return getImpressionCountingType((list == null || list.isEmpty()) ? null : list.get(0));
    }
}
