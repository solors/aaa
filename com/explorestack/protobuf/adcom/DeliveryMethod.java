package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* loaded from: classes3.dex */
public enum DeliveryMethod implements ProtocolMessageEnum {
    DELIVERY_METHOD_INVALID(0),
    DELIVERY_METHOD_STREAMING(1),
    DELIVERY_METHOD_PROGRESSIVE(2),
    DELIVERY_METHOD_DOWNLOAD(3),
    UNRECOGNIZED(-1);
    
    public static final int DELIVERY_METHOD_DOWNLOAD_VALUE = 3;
    public static final int DELIVERY_METHOD_INVALID_VALUE = 0;
    public static final int DELIVERY_METHOD_PROGRESSIVE_VALUE = 2;
    public static final int DELIVERY_METHOD_STREAMING_VALUE = 1;
    private final int value;
    private static final Internal.EnumLiteMap<DeliveryMethod> internalValueMap = new Internal.EnumLiteMap<DeliveryMethod>() { // from class: com.explorestack.protobuf.adcom.DeliveryMethod.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public DeliveryMethod findValueByNumber(int i) {
            return DeliveryMethod.forNumber(i);
        }
    };
    private static final DeliveryMethod[] VALUES = values();

    DeliveryMethod(int i) {
        this.value = i;
    }

    public static DeliveryMethod forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return DELIVERY_METHOD_DOWNLOAD;
                }
                return DELIVERY_METHOD_PROGRESSIVE;
            }
            return DELIVERY_METHOD_STREAMING;
        }
        return DELIVERY_METHOD_INVALID;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(8);
    }

    public static Internal.EnumLiteMap<DeliveryMethod> internalGetValueMap() {
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
    public static DeliveryMethod valueOf(int i) {
        return forNumber(i);
    }

    public static DeliveryMethod valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
