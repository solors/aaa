package com.smaato.sdk.core.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.ironsource.C20517nb;
import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.diinjection.Inject;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@AutoValue.CopyAnnotations
@AutoValue
/* loaded from: classes7.dex */
public abstract class MimeType {
    @Inject
    private static Logger logger;
    private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    @NonNull
    public static MimeType get(String str) {
        Matcher matcher = TYPE_SUBTYPE.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            String lowerCase2 = matcher.group(2).toLowerCase(locale);
            Matcher matcher2 = PARAMETER.matcher(str);
            String str2 = null;
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 != null && group2.equalsIgnoreCase(C20517nb.f52166M)) {
                        String group3 = matcher2.group(2);
                        if (group3 != null) {
                            if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                                group3 = group3.substring(1, group3.length() - 1);
                            }
                        } else {
                            group3 = matcher2.group(3);
                        }
                        if (str2 != null && !group3.equalsIgnoreCase(str2)) {
                            throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group3 + "\" for: \"" + str + '\"');
                        }
                        str2 = group3;
                    }
                } else {
                    throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
                }
            }
            return new AutoValue_MimeType(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    @Nullable
    public static MimeType parse(@Nullable String str) {
        String str2;
        try {
            return get(str);
        } catch (IllegalArgumentException e) {
            if (logger == null) {
                AndroidsInjector.injectStatic(MimeType.class);
            }
            Logger logger2 = logger;
            LogDomain logDomain = LogDomain.NETWORK;
            if (e.getMessage() != null) {
                str2 = e.getMessage();
            } else {
                str2 = "";
            }
            logger2.warning(logDomain, str2, e);
            return null;
        }
    }

    @Nullable
    public abstract String charset();

    @NonNull
    public abstract String string();

    @NonNull
    public abstract String subtype();

    @NonNull
    public abstract String type();
}
