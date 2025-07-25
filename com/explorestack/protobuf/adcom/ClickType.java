package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* loaded from: classes3.dex */
public enum ClickType implements ProtocolMessageEnum {
    CLICK_TYPE_NON_CLICKABLE(0),
    CLICK_TYPE_CLICKABLE_UNKNOWN(1),
    CLICK_TYPE_CLICKABLE_EMBEDDED_BROWSER(2),
    CLICK_TYPE_CLICKABLE_NATIVE_BROWSER(3),
    UNRECOGNIZED(-1);
    
    public static final int CLICK_TYPE_CLICKABLE_EMBEDDED_BROWSER_VALUE = 2;
    public static final int CLICK_TYPE_CLICKABLE_NATIVE_BROWSER_VALUE = 3;
    public static final int CLICK_TYPE_CLICKABLE_UNKNOWN_VALUE = 1;
    public static final int CLICK_TYPE_NON_CLICKABLE_VALUE = 0;
    private final int value;
    private static final Internal.EnumLiteMap<ClickType> internalValueMap = new Internal.EnumLiteMap<ClickType>() { // from class: com.explorestack.protobuf.adcom.ClickType.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public ClickType findValueByNumber(int i) {
            return ClickType.forNumber(i);
        }
    };
    private static final ClickType[] VALUES = values();

    ClickType(int i) {
        this.value = i;
    }

    public static ClickType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return CLICK_TYPE_CLICKABLE_NATIVE_BROWSER;
                }
                return CLICK_TYPE_CLICKABLE_EMBEDDED_BROWSER;
            }
            return CLICK_TYPE_CLICKABLE_UNKNOWN;
        }
        return CLICK_TYPE_NON_CLICKABLE;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(3);
    }

    public static Internal.EnumLiteMap<ClickType> internalGetValueMap() {
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
    public static ClickType valueOf(int i) {
        return forNumber(i);
    }

    public static ClickType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
