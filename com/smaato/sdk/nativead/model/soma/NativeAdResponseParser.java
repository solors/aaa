package com.smaato.sdk.nativead.model.soma;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.smaato.sdk.core.mvvm.model.AdResponse;
import com.smaato.sdk.core.mvvm.model.AdResponseParser;
import com.smaato.sdk.core.p568ad.AdType;
import com.smaato.sdk.core.util.HeaderValueUtils;
import com.smaato.sdk.nativead.NativeAdAssets;
import com.smaato.sdk.nativead.NativeAdLink;
import com.smaato.sdk.nativead.NativeAdTracker;
import com.smaato.sdk.nativead.model.NativeAdComponents;
import com.smaato.sdk.richmedia.util.HtmlPlayerUtils;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public class NativeAdResponseParser extends AdResponseParser {
    @NonNull
    private final HtmlPlayerUtils htmlPlayerUtils;
    private String mRaidContent;
    private static final NativeAdTracker.Type[] E_TYPES = {null, NativeAdTracker.Type.IMPRESSION, NativeAdTracker.Type.VIEWABLE_MRC_50, NativeAdTracker.Type.VIEWABLE_MRC_100, NativeAdTracker.Type.VIEWABLE_VIDEO_50};
    private static final NativeAdLink EMPTY_LINK = NativeAdLink.create("", Collections.emptyList());

    public NativeAdResponseParser(@NonNull HeaderValueUtils headerValueUtils, @NonNull HtmlPlayerUtils htmlPlayerUtils) {
        super(AdType.NATIVE, headerValueUtils);
        this.mRaidContent = "";
        this.htmlPlayerUtils = htmlPlayerUtils;
    }

    @Nullable
    private NativeAdComponents getNativeAdComponents(String str) throws IOException {
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if ("native".equals(jsonReader.nextName())) {
                NativeAdComponents.Builder link = NativeAdComponents.builder().trackers(Collections.emptyList()).link(EMPTY_LINK);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    if (jsonReader.peek() == JsonToken.NAME) {
                        String nextName = jsonReader.nextName();
                        nextName.hashCode();
                        char c = 65535;
                        switch (nextName.hashCode()) {
                            case -1408207997:
                                if (nextName.equals(POBNativeConstants.NATIVE_ASSETS)) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case -702986027:
                                if (nextName.equals(POBNativeConstants.NATIVE_EVENT_TRACKERS)) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case -314498168:
                                if (nextName.equals("privacy")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 3321850:
                                if (nextName.equals("link")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 1052580871:
                                if (nextName.equals(POBNativeConstants.NATIVE_IMPRESSION_TRACKER)) {
                                    c = 4;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                                link.assets(readAssets(jsonReader));
                                continue;
                            case 1:
                                link.trackers(readEventTrackers(jsonReader));
                                continue;
                            case 2:
                                link.privacyUrl(jsonReader.nextString());
                                continue;
                            case 3:
                                link.link(readLink(jsonReader));
                                continue;
                            case 4:
                                link.trackers(readImpTrackers(jsonReader));
                                continue;
                            default:
                                jsonReader.skipValue();
                                continue;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                if (jsonReader.peek() == JsonToken.END_ARRAY) {
                    jsonReader.endArray();
                }
                return link.build();
            }
            jsonReader.skipValue();
        }
        if (jsonReader.peek() == JsonToken.END_OBJECT) {
            jsonReader.endObject();
            return null;
        }
        return null;
    }

    private NativeAdAssets readAssets(JsonReader jsonReader) throws IOException {
        NativeAdAssets.Builder builder = NativeAdAssets.builder();
        ArrayList arrayList = new ArrayList(3);
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() != JsonToken.NULL && jsonReader.peek() == JsonToken.NAME) {
                    String nextName = jsonReader.nextName();
                    nextName.hashCode();
                    char c = 65535;
                    switch (nextName.hashCode()) {
                        case 100897:
                            if (nextName.equals("ext")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 104387:
                            if (nextName.equals(POBNativeConstants.NATIVE_IMAGE)) {
                                c = 1;
                                break;
                            }
                            break;
                        case 3076010:
                            if (nextName.equals("data")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 110371416:
                            if (nextName.equals("title")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 112202875:
                            if (nextName.equals("video")) {
                                c = 4;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            readMRAID(builder, jsonReader);
                            break;
                        case 1:
                            if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                                readImage(builder, jsonReader, arrayList);
                                break;
                            } else {
                                jsonReader.skipValue();
                                break;
                            }
                        case 2:
                            readData(builder, jsonReader);
                            break;
                        case 3:
                            readTitle(builder, jsonReader);
                            break;
                        case 4:
                            readVastTag(builder, jsonReader);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        }
        builder.images(Collections.unmodifiableList(arrayList));
        if (jsonReader.peek() == JsonToken.END_OBJECT) {
            jsonReader.endObject();
        }
        if (jsonReader.peek() == JsonToken.END_ARRAY) {
            jsonReader.endArray();
        }
        return builder.build();
    }

    private void readData(NativeAdAssets.Builder builder, JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        int i = 0;
        String str = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("type")) {
                if (!nextName.equals("value")) {
                    jsonReader.skipValue();
                } else {
                    str = jsonReader.nextString();
                }
            } else {
                i = jsonReader.nextInt();
            }
        }
        jsonReader.endObject();
        if (str == null) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 12) {
                        builder.cta(str);
                        return;
                    }
                    return;
                }
                builder.rating(Double.valueOf(Double.parseDouble(str)));
                return;
            }
            builder.text(str);
            return;
        }
        builder.sponsored(str);
    }

    private List<NativeAdTracker> readEventTrackers(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i = 1;
            String str = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.hashCode();
                if (!nextName.equals("url")) {
                    if (!nextName.equals("event")) {
                        jsonReader.skipValue();
                    } else {
                        i = jsonReader.nextInt();
                    }
                } else {
                    str = jsonReader.nextString();
                }
            }
            jsonReader.endObject();
            if (i > 0) {
                NativeAdTracker.Type[] typeArr = E_TYPES;
                if (i < typeArr.length) {
                    arrayList.add(NativeAdTracker.create(typeArr[i], str));
                }
            }
            if (i == 555) {
                arrayList.add(NativeAdTracker.create(NativeAdTracker.Type.OPEN_MEASUREMENT, str));
            }
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r6.equals("type") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void readImage(com.smaato.sdk.nativead.NativeAdAssets.Builder r11, android.util.JsonReader r12, java.util.List<com.smaato.sdk.nativead.NativeAdAssets.Image> r13) throws java.io.IOException {
        /*
            r10 = this;
            r12.beginObject()
            r0 = 0
            r1 = 0
            r2 = -1
            r3 = r0
            r4 = r2
            r5 = r4
        L9:
            boolean r6 = r12.hasNext()
            r7 = 3
            r8 = 1
            if (r6 == 0) goto L69
            java.lang.String r6 = r12.nextName()
            r6.hashCode()
            int r9 = r6.hashCode()
            switch(r9) {
                case 104: goto L40;
                case 119: goto L35;
                case 116079: goto L2a;
                case 3575610: goto L21;
                default: goto L1f;
            }
        L1f:
            r7 = r2
            goto L4a
        L21:
            java.lang.String r8 = "type"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L4a
            goto L1f
        L2a:
            java.lang.String r7 = "url"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L33
            goto L1f
        L33:
            r7 = 2
            goto L4a
        L35:
            java.lang.String r7 = "w"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L3e
            goto L1f
        L3e:
            r7 = r8
            goto L4a
        L40:
            java.lang.String r7 = "h"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L49
            goto L1f
        L49:
            r7 = r0
        L4a:
            switch(r7) {
                case 0: goto L64;
                case 1: goto L5f;
                case 2: goto L56;
                case 3: goto L51;
                default: goto L4d;
            }
        L4d:
            r12.skipValue()
            goto L9
        L51:
            int r3 = r12.nextInt()
            goto L9
        L56:
            java.lang.String r1 = r12.nextString()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            goto L9
        L5f:
            int r4 = r12.nextInt()
            goto L9
        L64:
            int r5 = r12.nextInt()
            goto L9
        L69:
            r12.endObject()
            if (r8 != r3) goto L76
            com.smaato.sdk.nativead.NativeAdAssets$Image r12 = com.smaato.sdk.nativead.NativeAdAssets.Image.create(r1, r4, r5)
            r11.icon(r12)
            goto L7f
        L76:
            if (r7 != r3) goto L7f
            com.smaato.sdk.nativead.NativeAdAssets$Image r11 = com.smaato.sdk.nativead.NativeAdAssets.Image.create(r1, r4, r5)
            r13.add(r11)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.nativead.model.soma.NativeAdResponseParser.readImage(com.smaato.sdk.nativead.NativeAdAssets$Builder, android.util.JsonReader, java.util.List):void");
    }

    private List<NativeAdTracker> readImpTrackers(JsonReader jsonReader) throws IOException {
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            if (jsonReader.peek() != JsonToken.NULL) {
                str = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
                str = null;
            }
            NativeAdTracker.Type[] typeArr = E_TYPES;
            if (1 < typeArr.length) {
                arrayList.add(str);
                arrayList2.add(NativeAdTracker.create(typeArr[1], str));
            }
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList2);
    }

    private NativeAdLink readLink(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("url".equals(nextName)) {
                str = jsonReader.nextString();
            } else if (POBNativeConstants.NATIVE_CLICK_TRACKER.equals(nextName)) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(jsonReader.nextString());
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return NativeAdLink.create(str, arrayList);
    }

    private void readMRAID(NativeAdAssets.Builder builder, JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        if ("adm".equals(jsonReader.nextName())) {
            this.mRaidContent = jsonReader.nextString();
        }
        builder.mraidJs(this.mRaidContent);
    }

    private void readTitle(NativeAdAssets.Builder builder, JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if ("text".equals(jsonReader.nextName())) {
                builder.title(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private void readVastTag(NativeAdAssets.Builder builder, JsonReader jsonReader) throws IOException {
        String str;
        jsonReader.beginObject();
        if ("vasttag".equals(jsonReader.nextName())) {
            str = jsonReader.nextString();
        } else {
            str = "";
        }
        builder.vastTag(str);
    }

    private NativeAdComponents wrapVastInMraid(NativeAdComponents nativeAdComponents) {
        String vastTag = nativeAdComponents.assets().vastTag();
        if (nativeAdComponents.assets().vastTag() != null) {
            return nativeAdComponents.buildUpon().mraidWrappedVast(this.htmlPlayerUtils.vastToRichMedia(vastTag)).build();
        }
        return nativeAdComponents;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponseParser
    protected AdResponse parseResponse(AdResponse.Builder builder, String str, long j) throws IOException {
        NativeAdComponents nativeAdComponents = getNativeAdComponents(str);
        if (nativeAdComponents != null) {
            nativeAdComponents = wrapVastInMraid(nativeAdComponents);
        }
        return builder.setNativeObject(nativeAdComponents).setWidth(0).setHeight(0).setImpressionTrackingUrls(new ArrayList()).setClickTrackingUrls(new ArrayList()).build();
    }
}
