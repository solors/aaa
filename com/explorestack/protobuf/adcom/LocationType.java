package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* loaded from: classes3.dex */
public enum LocationType implements ProtocolMessageEnum {
    LOCATION_TYPE_INVALID(0),
    LOCATION_TYPE_GPS(1),
    LOCATION_TYPE_IP(2),
    LOCATION_TYPE_USER(3),
    UNRECOGNIZED(-1);
    
    public static final int LOCATION_TYPE_GPS_VALUE = 1;
    public static final int LOCATION_TYPE_INVALID_VALUE = 0;
    public static final int LOCATION_TYPE_IP_VALUE = 2;
    public static final int LOCATION_TYPE_USER_VALUE = 3;
    private final int value;
    private static final Internal.EnumLiteMap<LocationType> internalValueMap = new Internal.EnumLiteMap<LocationType>() { // from class: com.explorestack.protobuf.adcom.LocationType.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public LocationType findValueByNumber(int i) {
            return LocationType.forNumber(i);
        }
    };
    private static final LocationType[] VALUES = values();

    LocationType(int i) {
        this.value = i;
    }

    public static LocationType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return LOCATION_TYPE_USER;
                }
                return LOCATION_TYPE_IP;
            }
            return LOCATION_TYPE_GPS;
        }
        return LOCATION_TYPE_INVALID;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(18);
    }

    public static Internal.EnumLiteMap<LocationType> internalGetValueMap() {
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
    public static LocationType valueOf(int i) {
        return forNumber(i);
    }

    public static LocationType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
