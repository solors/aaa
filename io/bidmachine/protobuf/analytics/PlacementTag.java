package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* loaded from: classes9.dex */
public enum PlacementTag implements ProtocolMessageEnum {
    PLACEMENT_TAG_INVALID(0),
    PLACEMENT_TAG_DISPLAY_BANNER(1),
    PLACEMENT_TAG_DISPLAY_INTERSTITIAL(2),
    PLACEMENT_TAG_DISPLAY_NATIVE(3),
    PLACEMENT_TAG_VIDEO(4),
    PLACEMENT_TAG_REWARDED_VIDEO(5),
    UNRECOGNIZED(-1);
    
    public static final int PLACEMENT_TAG_DISPLAY_BANNER_VALUE = 1;
    public static final int PLACEMENT_TAG_DISPLAY_INTERSTITIAL_VALUE = 2;
    public static final int PLACEMENT_TAG_DISPLAY_NATIVE_VALUE = 3;
    public static final int PLACEMENT_TAG_INVALID_VALUE = 0;
    public static final int PLACEMENT_TAG_REWARDED_VIDEO_VALUE = 5;
    public static final int PLACEMENT_TAG_VIDEO_VALUE = 4;
    private final int value;
    private static final Internal.EnumLiteMap<PlacementTag> internalValueMap = new Internal.EnumLiteMap<PlacementTag>() { // from class: io.bidmachine.protobuf.analytics.PlacementTag.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public PlacementTag findValueByNumber(int i) {
            return PlacementTag.forNumber(i);
        }
    };
    private static final PlacementTag[] VALUES = values();

    PlacementTag(int i) {
        this.value = i;
    }

    public static PlacementTag forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return PLACEMENT_TAG_REWARDED_VIDEO;
                        }
                        return PLACEMENT_TAG_VIDEO;
                    }
                    return PLACEMENT_TAG_DISPLAY_NATIVE;
                }
                return PLACEMENT_TAG_DISPLAY_INTERSTITIAL;
            }
            return PLACEMENT_TAG_DISPLAY_BANNER;
        }
        return PLACEMENT_TAG_INVALID;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AnalyticsProto.getDescriptor().getEnumTypes().get(0);
    }

    public static Internal.EnumLiteMap<PlacementTag> internalGetValueMap() {
        return internalValueMap;
    }

    @Override // com.explorestack.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.explorestack.protobuf.ProtocolMessageEnum, com.explorestack.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // com.explorestack.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return getDescriptor().getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }

    @Deprecated
    public static PlacementTag valueOf(int i) {
        return forNumber(i);
    }

    public static PlacementTag valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
