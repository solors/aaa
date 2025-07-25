package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* loaded from: classes3.dex */
public enum ExpandableDirection implements ProtocolMessageEnum {
    EXPANDABLE_DIRECTION_INVALID(0),
    EXPANDABLE_DIRECTION_LEFT(1),
    EXPANDABLE_DIRECTION_RIGHT(2),
    EXPANDABLE_DIRECTION_UP(3),
    EXPANDABLE_DIRECTION_DOWN(4),
    EXPANDABLE_DIRECTION_FULL_SCREEN(5),
    UNRECOGNIZED(-1);
    
    public static final int EXPANDABLE_DIRECTION_DOWN_VALUE = 4;
    public static final int EXPANDABLE_DIRECTION_FULL_SCREEN_VALUE = 5;
    public static final int EXPANDABLE_DIRECTION_INVALID_VALUE = 0;
    public static final int EXPANDABLE_DIRECTION_LEFT_VALUE = 1;
    public static final int EXPANDABLE_DIRECTION_RIGHT_VALUE = 2;
    public static final int EXPANDABLE_DIRECTION_UP_VALUE = 3;
    private final int value;
    private static final Internal.EnumLiteMap<ExpandableDirection> internalValueMap = new Internal.EnumLiteMap<ExpandableDirection>() { // from class: com.explorestack.protobuf.adcom.ExpandableDirection.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public ExpandableDirection findValueByNumber(int i) {
            return ExpandableDirection.forNumber(i);
        }
    };
    private static final ExpandableDirection[] VALUES = values();

    ExpandableDirection(int i) {
        this.value = i;
    }

    public static ExpandableDirection forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return EXPANDABLE_DIRECTION_FULL_SCREEN;
                        }
                        return EXPANDABLE_DIRECTION_DOWN;
                    }
                    return EXPANDABLE_DIRECTION_UP;
                }
                return EXPANDABLE_DIRECTION_RIGHT;
            }
            return EXPANDABLE_DIRECTION_LEFT;
        }
        return EXPANDABLE_DIRECTION_INVALID;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(13);
    }

    public static Internal.EnumLiteMap<ExpandableDirection> internalGetValueMap() {
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
    public static ExpandableDirection valueOf(int i) {
        return forNumber(i);
    }

    public static ExpandableDirection valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
