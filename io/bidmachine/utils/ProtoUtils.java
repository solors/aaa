package io.bidmachine.utils;

import android.location.Location;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.C10729Ad;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.EventType;
import com.explorestack.protobuf.adcom.LocationType;
import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.TrackEventType;
import io.bidmachine.banner.BannerSize;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.AdExtension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class ProtoUtils {

    /* renamed from: io.bidmachine.utils.ProtoUtils$a */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class C37114a {
        static final /* synthetic */ int[] $SwitchMap$com$explorestack$protobuf$Value$KindCase;

        static {
            int[] iArr = new int[Value.KindCase.values().length];
            $SwitchMap$com$explorestack$protobuf$Value$KindCase = iArr;
            try {
                iArr[Value.KindCase.NUMBER_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$Value$KindCase[Value.KindCase.STRING_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$Value$KindCase[Value.KindCase.BOOL_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$Value$KindCase[Value.KindCase.STRUCT_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$Value$KindCase[Value.KindCase.LIST_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void addEvent(@NonNull Map<TrackEventType, List<String>> map, @NonNull TrackEventType trackEventType, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List<String> list = map.get(trackEventType);
        if (list == null) {
            list = new ArrayList<>(1);
            map.put(trackEventType, list);
        }
        list.add(str);
    }

    @NonNull
    public static Context.Geo.Builder createGeoBuilderWithLocation(@NonNull android.content.Context context, @Nullable Location location, @Nullable Location location2, boolean z) {
        Context.Geo.Builder newBuilder = Context.Geo.newBuilder();
        fillGeoBuilder(newBuilder, Utils.getBestLocation(context, location, location2), z);
        return newBuilder;
    }

    @Nullable
    public static String encodeToString(@Nullable MessageLite messageLite) {
        if (messageLite == null) {
            return null;
        }
        try {
            return Base64.encodeToString(messageLite.toByteArray(), 2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void fillGeoBuilder(@NonNull Context.Geo.Builder builder, @Nullable Location location, boolean z) {
        if (z) {
            builder.setUtcoffset(Utils.getUtcOffsetMinutes());
        }
        if (location != null) {
            builder.setType(getLocationType(location));
            builder.setLat((float) location.getLatitude());
            builder.setLon((float) location.getLongitude());
            builder.setAccur((int) location.getAccuracy());
            builder.setLastfix(location.getTime());
        }
    }

    @Nullable
    public static AdExtension findFirstAdExtension(@NonNull C10729Ad c10729Ad) {
        Any extProto;
        int extProtoCount = c10729Ad.getExtProtoCount();
        if (extProtoCount > 0) {
            for (int i = 0; i < extProtoCount; i++) {
                try {
                    extProto = c10729Ad.getExtProto(i);
                } catch (Throwable th) {
                    Logger.m20086w(th);
                }
                if (extProto.m78936is(AdExtension.class)) {
                    return (AdExtension) extProto.unpack(AdExtension.class);
                }
                continue;
            }
            return null;
        }
        return null;
    }

    public static LocationType getLocationType(@Nullable Location location) {
        if (location != null) {
            if ("gps".equals(location.getProvider())) {
                return LocationType.LOCATION_TYPE_GPS;
            }
            if ("network".equals(location.getProvider()) || "passive".equals(location.getProvider())) {
                return LocationType.LOCATION_TYPE_IP;
            }
        }
        return LocationType.LOCATION_TYPE_INVALID;
    }

    public static boolean isBannerPlacement(@NonNull Placement placement, @NonNull BannerSize bannerSize) {
        Placement.DisplayPlacement display = placement.getDisplay();
        if (!display.getInstl() && bannerSize.width == display.getW() && bannerSize.height == display.getH()) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(@Nullable Struct struct) {
        return struct == null || struct.getFieldsCount() <= 0;
    }

    public static boolean isInterstitialPlacement(@NonNull Placement placement) {
        if (isRewardedPlacement(placement)) {
            return false;
        }
        Placement.DisplayPlacement display = placement.getDisplay();
        if (display != Placement.DisplayPlacement.getDefaultInstance() && display.getInstl()) {
            return true;
        }
        return isVideoPlacement(placement);
    }

    public static boolean isNativePlacement(@NonNull Placement placement) {
        if (placement.getDisplay().getNativefmt().getAssetCount() > 0) {
            return true;
        }
        return false;
    }

    public static boolean isRewardedPlacement(@NonNull Placement placement) {
        return placement.getReward();
    }

    public static boolean isVideoPlacement(@NonNull Placement placement) {
        if (placement.getVideo() != Placement.VideoPlacement.getDefaultInstance()) {
            return true;
        }
        return false;
    }

    @NonNull
    public static Timestamp msToProtobufTimestamp(long j) {
        return Timestamp.newBuilder().setSeconds(j / 1000).setNanos(((int) (j % 1000)) * 1000000).build();
    }

    public static void prepareEvents(@NonNull Map<TrackEventType, List<String>> map, @Nullable List<C10729Ad.Event> list) {
        TrackEventType fromNumber;
        if (list != null && !list.isEmpty()) {
            for (C10729Ad.Event event : list) {
                if (event.getType() == EventType.EVENT_TYPE_IMPRESSION) {
                    fromNumber = TrackEventType.Show;
                } else {
                    fromNumber = TrackEventType.fromNumber(event.getTypeValue());
                }
                if (fromNumber != null) {
                    addEvent(map, fromNumber, event.getUrl());
                }
            }
        }
    }

    @NonNull
    public static List<Object> toList(@Nullable ListValue listValue) {
        List<Object> listOrNull = toListOrNull(listValue);
        if (listOrNull == null) {
            return new ArrayList();
        }
        return listOrNull;
    }

    @Nullable
    public static List<Object> toListOrNull(@Nullable ListValue listValue) {
        if (isEmpty(listValue)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Value value : listValue.getValuesList()) {
            Object objectOrNull = toObjectOrNull(value);
            if (objectOrNull != null) {
                arrayList.add(objectOrNull);
            }
        }
        return arrayList;
    }

    @Nullable
    public static ListValue.Builder toListValueBuilderOrNull(@Nullable List<?> list) {
        if (list != null && !list.isEmpty()) {
            ListValue.Builder newBuilder = ListValue.newBuilder();
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                Value.Builder valueBuilderOrNull = toValueBuilderOrNull(it.next());
                if (valueBuilderOrNull != null) {
                    newBuilder.addValues(valueBuilderOrNull);
                }
            }
            return newBuilder;
        }
        return null;
    }

    @NonNull
    public static Map<String, Object> toMap(@Nullable Struct struct) {
        Map<String, Object> mapOrNull = toMapOrNull(struct);
        if (mapOrNull == null) {
            return new HashMap();
        }
        return mapOrNull;
    }

    @Nullable
    public static Map<String, Object> toMapOrNull(@Nullable Struct struct) {
        Object objectOrNull;
        if (isEmpty(struct)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Value> entry : struct.getFieldsMap().entrySet()) {
            String key = entry.getKey();
            Value value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null && (objectOrNull = toObjectOrNull(value)) != null) {
                hashMap.put(key, objectOrNull);
            }
        }
        return hashMap;
    }

    @Nullable
    public static Object toObjectOrNull(@Nullable Value value) {
        if (value == null) {
            return null;
        }
        int i = C37114a.$SwitchMap$com$explorestack$protobuf$Value$KindCase[value.getKindCase().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return toListOrNull(value.getListValue());
                    }
                    return toMapOrNull(value.getStructValue());
                }
                return Boolean.valueOf(value.getBoolValue());
            }
            return value.getStringValue();
        }
        return Double.valueOf(value.getNumberValue());
    }

    @Nullable
    public static Struct.Builder toStructBuilderOrNull(@Nullable Map<?, ?> map) {
        Value.Builder valueBuilderOrNull;
        if (map != null && !map.isEmpty()) {
            Struct.Builder newBuilder = Struct.newBuilder();
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                Object key = entry.getKey();
                if (key != null) {
                    String valueOf = String.valueOf(key);
                    if (!TextUtils.isEmpty(valueOf) && (valueBuilderOrNull = toValueBuilderOrNull(entry.getValue())) != null) {
                        newBuilder.putFields(valueOf, valueBuilderOrNull.build());
                    }
                }
            }
            return newBuilder;
        }
        return null;
    }

    @Nullable
    public static Value.Builder toValueBuilderOrNull(@Nullable Object obj) {
        Struct.Builder structBuilderOrNull;
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return Value.newBuilder().setStringValue((String) obj);
        }
        if (obj instanceof Number) {
            return Value.newBuilder().setNumberValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return Value.newBuilder().setBoolValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof List) {
            ListValue.Builder listValueBuilderOrNull = toListValueBuilderOrNull((List) obj);
            if (listValueBuilderOrNull != null) {
                return Value.newBuilder().setListValue(listValueBuilderOrNull);
            }
        } else if ((obj instanceof Map) && (structBuilderOrNull = toStructBuilderOrNull((Map) obj)) != null) {
            return Value.newBuilder().setStructValue(structBuilderOrNull);
        }
        return null;
    }

    public static boolean isEmpty(@Nullable ListValue listValue) {
        return listValue == null || listValue.getValuesCount() <= 0;
    }
}
