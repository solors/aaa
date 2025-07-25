package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* loaded from: classes3.dex */
public enum IpLocationService implements ProtocolMessageEnum {
    IP_LOCATION_SERVICE_INVALID(0),
    IP_LOCATION_SERVICE_IP2LOCATION(1),
    IP_LOCATION_SERVICE_NEUSTAR(2),
    IP_LOCATION_SERVICE_MAXMIND(3),
    IP_LOCATION_SERVICE_NETAQUITY(4),
    UNRECOGNIZED(-1);
    
    public static final int IP_LOCATION_SERVICE_INVALID_VALUE = 0;
    public static final int IP_LOCATION_SERVICE_IP2LOCATION_VALUE = 1;
    public static final int IP_LOCATION_SERVICE_MAXMIND_VALUE = 3;
    public static final int IP_LOCATION_SERVICE_NETAQUITY_VALUE = 4;
    public static final int IP_LOCATION_SERVICE_NEUSTAR_VALUE = 2;
    private final int value;
    private static final Internal.EnumLiteMap<IpLocationService> internalValueMap = new Internal.EnumLiteMap<IpLocationService>() { // from class: com.explorestack.protobuf.adcom.IpLocationService.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public IpLocationService findValueByNumber(int i) {
            return IpLocationService.forNumber(i);
        }
    };
    private static final IpLocationService[] VALUES = values();

    IpLocationService(int i) {
        this.value = i;
    }

    public static IpLocationService forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return IP_LOCATION_SERVICE_NETAQUITY;
                    }
                    return IP_LOCATION_SERVICE_MAXMIND;
                }
                return IP_LOCATION_SERVICE_NEUSTAR;
            }
            return IP_LOCATION_SERVICE_IP2LOCATION;
        }
        return IP_LOCATION_SERVICE_INVALID;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(16);
    }

    public static Internal.EnumLiteMap<IpLocationService> internalGetValueMap() {
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
    public static IpLocationService valueOf(int i) {
        return forNumber(i);
    }

    public static IpLocationService valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
