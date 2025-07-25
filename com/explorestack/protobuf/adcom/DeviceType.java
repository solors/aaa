package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* loaded from: classes3.dex */
public enum DeviceType implements ProtocolMessageEnum {
    DEVICE_TYPE_INVALID(0),
    DEVICE_TYPE_MOBILE(1),
    DEVICE_TYPE_PHONE_DEVICE(4),
    DEVICE_TYPE_TABLET(5),
    UNRECOGNIZED(-1);
    
    public static final int DEVICE_TYPE_INVALID_VALUE = 0;
    public static final int DEVICE_TYPE_MOBILE_VALUE = 1;
    public static final int DEVICE_TYPE_PHONE_DEVICE_VALUE = 4;
    public static final int DEVICE_TYPE_TABLET_VALUE = 5;
    private final int value;
    private static final Internal.EnumLiteMap<DeviceType> internalValueMap = new Internal.EnumLiteMap<DeviceType>() { // from class: com.explorestack.protobuf.adcom.DeviceType.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public DeviceType findValueByNumber(int i) {
            return DeviceType.forNumber(i);
        }
    };
    private static final DeviceType[] VALUES = values();

    DeviceType(int i) {
        this.value = i;
    }

    public static DeviceType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 4) {
                    if (i != 5) {
                        return null;
                    }
                    return DEVICE_TYPE_TABLET;
                }
                return DEVICE_TYPE_PHONE_DEVICE;
            }
            return DEVICE_TYPE_MOBILE;
        }
        return DEVICE_TYPE_INVALID;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(9);
    }

    public static Internal.EnumLiteMap<DeviceType> internalGetValueMap() {
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
    public static DeviceType valueOf(int i) {
        return forNumber(i);
    }

    public static DeviceType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
