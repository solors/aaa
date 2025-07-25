package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* loaded from: classes3.dex */
public enum EventType implements ProtocolMessageEnum {
    EVENT_TYPE_INVALID(0),
    EVENT_TYPE_IMPRESSION(1),
    EVENT_TYPE_VIEWABLE_MRC_50(2),
    EVENT_TYPE_VIEWABLE_MRC_100(3),
    EVENT_TYPE_VIEWABLE_VIDEO_50(4),
    UNRECOGNIZED(-1);
    
    public static final int EVENT_TYPE_IMPRESSION_VALUE = 1;
    public static final int EVENT_TYPE_INVALID_VALUE = 0;
    public static final int EVENT_TYPE_VIEWABLE_MRC_100_VALUE = 3;
    public static final int EVENT_TYPE_VIEWABLE_MRC_50_VALUE = 2;
    public static final int EVENT_TYPE_VIEWABLE_VIDEO_50_VALUE = 4;
    private final int value;
    private static final Internal.EnumLiteMap<EventType> internalValueMap = new Internal.EnumLiteMap<EventType>() { // from class: com.explorestack.protobuf.adcom.EventType.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public EventType findValueByNumber(int i) {
            return EventType.forNumber(i);
        }
    };
    private static final EventType[] VALUES = values();

    EventType(int i) {
        this.value = i;
    }

    public static EventType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return EVENT_TYPE_VIEWABLE_VIDEO_50;
                    }
                    return EVENT_TYPE_VIEWABLE_MRC_100;
                }
                return EVENT_TYPE_VIEWABLE_MRC_50;
            }
            return EVENT_TYPE_IMPRESSION;
        }
        return EVENT_TYPE_INVALID;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(15);
    }

    public static Internal.EnumLiteMap<EventType> internalGetValueMap() {
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
    public static EventType valueOf(int i) {
        return forNumber(i);
    }

    public static EventType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
