package gatewayprotocol.p687v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: gatewayprotocol.v1.DynamicDeviceInfoOuterClass */
/* loaded from: classes9.dex */
public final class DynamicDeviceInfoOuterClass {

    /* renamed from: gatewayprotocol.v1.DynamicDeviceInfoOuterClass$ConnectionType */
    /* loaded from: classes9.dex */
    public enum ConnectionType implements Internal.EnumLite {
        CONNECTION_TYPE_UNSPECIFIED(0),
        CONNECTION_TYPE_WIFI(1),
        CONNECTION_TYPE_CELLULAR(2),
        UNRECOGNIZED(-1);
        
        public static final int CONNECTION_TYPE_CELLULAR_VALUE = 2;
        public static final int CONNECTION_TYPE_UNSPECIFIED_VALUE = 0;
        public static final int CONNECTION_TYPE_WIFI_VALUE = 1;
        private static final Internal.EnumLiteMap<ConnectionType> internalValueMap = new C33254a();
        private final int value;

        /* renamed from: gatewayprotocol.v1.DynamicDeviceInfoOuterClass$ConnectionType$a */
        /* loaded from: classes9.dex */
        class C33254a implements Internal.EnumLiteMap<ConnectionType> {
            C33254a() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public ConnectionType findValueByNumber(int i) {
                return ConnectionType.forNumber(i);
            }
        }

        /* renamed from: gatewayprotocol.v1.DynamicDeviceInfoOuterClass$ConnectionType$b */
        /* loaded from: classes9.dex */
        private static final class C33255b implements Internal.EnumVerifier {

            /* renamed from: a */
            static final Internal.EnumVerifier f90807a = new C33255b();

            private C33255b() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                if (ConnectionType.forNumber(i) != null) {
                    return true;
                }
                return false;
            }
        }

        ConnectionType(int i) {
            this.value = i;
        }

        public static ConnectionType forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return CONNECTION_TYPE_CELLULAR;
                }
                return CONNECTION_TYPE_WIFI;
            }
            return CONNECTION_TYPE_UNSPECIFIED;
        }

        public static Internal.EnumLiteMap<ConnectionType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C33255b.f90807a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ConnectionType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo */
    /* loaded from: classes9.dex */
    public static final class DynamicDeviceInfo extends GeneratedMessageLite<DynamicDeviceInfo, Builder> implements DynamicDeviceInfoOrBuilder {
        public static final int ANDROID_FIELD_NUMBER = 12;
        public static final int APP_ACTIVE_FIELD_NUMBER = 17;
        public static final int BATTERY_LEVEL_FIELD_NUMBER = 14;
        public static final int BATTERY_STATUS_FIELD_NUMBER = 15;
        public static final int CONNECTION_TYPE_FIELD_NUMBER = 16;
        private static final DynamicDeviceInfo DEFAULT_INSTANCE;
        public static final int FREE_DISK_SPACE_FIELD_NUMBER = 5;
        public static final int FREE_RAM_MEMORY_FIELD_NUMBER = 6;
        public static final int IOS_FIELD_NUMBER = 13;
        public static final int LANGUAGE_FIELD_NUMBER = 1;
        public static final int LIMITED_OPEN_AD_TRACKING_FIELD_NUMBER = 11;
        public static final int LIMITED_TRACKING_FIELD_NUMBER = 10;
        public static final int LOW_POWER_MODE_FIELD_NUMBER = 18;
        public static final int NETWORK_OPERATOR_FIELD_NUMBER = 2;
        public static final int NETWORK_OPERATOR_NAME_FIELD_NUMBER = 3;
        private static volatile Parser<DynamicDeviceInfo> PARSER = null;
        public static final int SCREEN_HEIGHT_FIELD_NUMBER = 21;
        public static final int SCREEN_WIDTH_FIELD_NUMBER = 20;
        public static final int TIME_ZONE_FIELD_NUMBER = 8;
        public static final int TIME_ZONE_OFFSET_FIELD_NUMBER = 9;
        public static final int USER_ID_FIELD_NUMBER = 19;
        public static final int WIRED_HEADSET_FIELD_NUMBER = 7;
        private boolean appActive_;
        private double batteryLevel_;
        private int batteryStatus_;
        private int bitField0_;
        private int connectionType_;
        private long freeDiskSpace_;
        private long freeRamMemory_;
        private boolean limitedOpenAdTracking_;
        private boolean limitedTracking_;
        private boolean lowPowerMode_;
        private Object platformSpecific_;
        private int screenHeight_;
        private int screenWidth_;
        private long timeZoneOffset_;
        private boolean wiredHeadset_;
        private int platformSpecificCase_ = 0;
        private String language_ = "";
        private String networkOperator_ = "";
        private String networkOperatorName_ = "";
        private String timeZone_ = "";
        private String userId_ = "";

        /* renamed from: gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android */
        /* loaded from: classes9.dex */
        public static final class Android extends GeneratedMessageLite<Android, Builder> implements AndroidOrBuilder {
            public static final int ADB_ENABLED_FIELD_NUMBER = 5;
            public static final int AIRPLANE_MODE_FIELD_NUMBER = 11;
            public static final int CHARGING_TYPE_FIELD_NUMBER = 15;
            private static final Android DEFAULT_INSTANCE;
            public static final int DEVICE_ELAPSED_REALTIME_FIELD_NUMBER = 10;
            public static final int DEVICE_UP_TIME_FIELD_NUMBER = 9;
            public static final int MAX_VOLUME_FIELD_NUMBER = 8;
            public static final int NETWORK_CAPABILITY_TRANSPORTS_FIELD_NUMBER = 14;
            public static final int NETWORK_CONNECTED_FIELD_NUMBER = 1;
            public static final int NETWORK_METERED_FIELD_NUMBER = 3;
            public static final int NETWORK_TYPE_FIELD_NUMBER = 2;
            private static volatile Parser<Android> PARSER = null;
            public static final int SD_CARD_PRESENT_FIELD_NUMBER = 13;
            public static final int STAY_ON_WHILE_PLUGGED_IN_FIELD_NUMBER = 12;
            public static final int TELEPHONY_MANAGER_NETWORK_TYPE_FIELD_NUMBER = 4;
            public static final int USB_CONNECTED_FIELD_NUMBER = 6;
            public static final int VOLUME_FIELD_NUMBER = 7;
            private boolean adbEnabled_;
            private boolean airplaneMode_;
            private int bitField0_;
            private int chargingType_;
            private long deviceElapsedRealtime_;
            private long deviceUpTime_;
            private double maxVolume_;
            private NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports_;
            private boolean networkConnected_;
            private boolean networkMetered_;
            private int networkType_;
            private boolean sdCardPresent_;
            private boolean stayOnWhilePluggedIn_;
            private int telephonyManagerNetworkType_;
            private boolean usbConnected_;
            private double volume_;

            /* renamed from: gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder */
            /* loaded from: classes9.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<Android, Builder> implements AndroidOrBuilder {
                /* synthetic */ Builder(C33256a c33256a) {
                    this();
                }

                public Builder clearAdbEnabled() {
                    copyOnWrite();
                    ((Android) this.instance).clearAdbEnabled();
                    return this;
                }

                public Builder clearAirplaneMode() {
                    copyOnWrite();
                    ((Android) this.instance).clearAirplaneMode();
                    return this;
                }

                public Builder clearChargingType() {
                    copyOnWrite();
                    ((Android) this.instance).clearChargingType();
                    return this;
                }

                public Builder clearDeviceElapsedRealtime() {
                    copyOnWrite();
                    ((Android) this.instance).clearDeviceElapsedRealtime();
                    return this;
                }

                public Builder clearDeviceUpTime() {
                    copyOnWrite();
                    ((Android) this.instance).clearDeviceUpTime();
                    return this;
                }

                public Builder clearMaxVolume() {
                    copyOnWrite();
                    ((Android) this.instance).clearMaxVolume();
                    return this;
                }

                public Builder clearNetworkCapabilityTransports() {
                    copyOnWrite();
                    ((Android) this.instance).clearNetworkCapabilityTransports();
                    return this;
                }

                public Builder clearNetworkConnected() {
                    copyOnWrite();
                    ((Android) this.instance).clearNetworkConnected();
                    return this;
                }

                public Builder clearNetworkMetered() {
                    copyOnWrite();
                    ((Android) this.instance).clearNetworkMetered();
                    return this;
                }

                public Builder clearNetworkType() {
                    copyOnWrite();
                    ((Android) this.instance).clearNetworkType();
                    return this;
                }

                public Builder clearSdCardPresent() {
                    copyOnWrite();
                    ((Android) this.instance).clearSdCardPresent();
                    return this;
                }

                public Builder clearStayOnWhilePluggedIn() {
                    copyOnWrite();
                    ((Android) this.instance).clearStayOnWhilePluggedIn();
                    return this;
                }

                public Builder clearTelephonyManagerNetworkType() {
                    copyOnWrite();
                    ((Android) this.instance).clearTelephonyManagerNetworkType();
                    return this;
                }

                public Builder clearUsbConnected() {
                    copyOnWrite();
                    ((Android) this.instance).clearUsbConnected();
                    return this;
                }

                public Builder clearVolume() {
                    copyOnWrite();
                    ((Android) this.instance).clearVolume();
                    return this;
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean getAdbEnabled() {
                    return ((Android) this.instance).getAdbEnabled();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean getAirplaneMode() {
                    return ((Android) this.instance).getAirplaneMode();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public int getChargingType() {
                    return ((Android) this.instance).getChargingType();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public long getDeviceElapsedRealtime() {
                    return ((Android) this.instance).getDeviceElapsedRealtime();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public long getDeviceUpTime() {
                    return ((Android) this.instance).getDeviceUpTime();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public double getMaxVolume() {
                    return ((Android) this.instance).getMaxVolume();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
                    return ((Android) this.instance).getNetworkCapabilityTransports();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean getNetworkConnected() {
                    return ((Android) this.instance).getNetworkConnected();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean getNetworkMetered() {
                    return ((Android) this.instance).getNetworkMetered();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public int getNetworkType() {
                    return ((Android) this.instance).getNetworkType();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean getSdCardPresent() {
                    return ((Android) this.instance).getSdCardPresent();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean getStayOnWhilePluggedIn() {
                    return ((Android) this.instance).getStayOnWhilePluggedIn();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public int getTelephonyManagerNetworkType() {
                    return ((Android) this.instance).getTelephonyManagerNetworkType();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean getUsbConnected() {
                    return ((Android) this.instance).getUsbConnected();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public double getVolume() {
                    return ((Android) this.instance).getVolume();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasAdbEnabled() {
                    return ((Android) this.instance).hasAdbEnabled();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasAirplaneMode() {
                    return ((Android) this.instance).hasAirplaneMode();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasChargingType() {
                    return ((Android) this.instance).hasChargingType();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasDeviceElapsedRealtime() {
                    return ((Android) this.instance).hasDeviceElapsedRealtime();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasDeviceUpTime() {
                    return ((Android) this.instance).hasDeviceUpTime();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasMaxVolume() {
                    return ((Android) this.instance).hasMaxVolume();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasNetworkCapabilityTransports() {
                    return ((Android) this.instance).hasNetworkCapabilityTransports();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasNetworkConnected() {
                    return ((Android) this.instance).hasNetworkConnected();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasNetworkMetered() {
                    return ((Android) this.instance).hasNetworkMetered();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasNetworkType() {
                    return ((Android) this.instance).hasNetworkType();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasSdCardPresent() {
                    return ((Android) this.instance).hasSdCardPresent();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasStayOnWhilePluggedIn() {
                    return ((Android) this.instance).hasStayOnWhilePluggedIn();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasTelephonyManagerNetworkType() {
                    return ((Android) this.instance).hasTelephonyManagerNetworkType();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasUsbConnected() {
                    return ((Android) this.instance).hasUsbConnected();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
                public boolean hasVolume() {
                    return ((Android) this.instance).hasVolume();
                }

                public Builder mergeNetworkCapabilityTransports(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports) {
                    copyOnWrite();
                    ((Android) this.instance).mergeNetworkCapabilityTransports(networkCapabilityTransports);
                    return this;
                }

                public Builder setAdbEnabled(boolean z) {
                    copyOnWrite();
                    ((Android) this.instance).setAdbEnabled(z);
                    return this;
                }

                public Builder setAirplaneMode(boolean z) {
                    copyOnWrite();
                    ((Android) this.instance).setAirplaneMode(z);
                    return this;
                }

                public Builder setChargingType(int i) {
                    copyOnWrite();
                    ((Android) this.instance).setChargingType(i);
                    return this;
                }

                public Builder setDeviceElapsedRealtime(long j) {
                    copyOnWrite();
                    ((Android) this.instance).setDeviceElapsedRealtime(j);
                    return this;
                }

                public Builder setDeviceUpTime(long j) {
                    copyOnWrite();
                    ((Android) this.instance).setDeviceUpTime(j);
                    return this;
                }

                public Builder setMaxVolume(double d) {
                    copyOnWrite();
                    ((Android) this.instance).setMaxVolume(d);
                    return this;
                }

                public Builder setNetworkCapabilityTransports(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports) {
                    copyOnWrite();
                    ((Android) this.instance).setNetworkCapabilityTransports(networkCapabilityTransports);
                    return this;
                }

                public Builder setNetworkConnected(boolean z) {
                    copyOnWrite();
                    ((Android) this.instance).setNetworkConnected(z);
                    return this;
                }

                public Builder setNetworkMetered(boolean z) {
                    copyOnWrite();
                    ((Android) this.instance).setNetworkMetered(z);
                    return this;
                }

                public Builder setNetworkType(int i) {
                    copyOnWrite();
                    ((Android) this.instance).setNetworkType(i);
                    return this;
                }

                public Builder setSdCardPresent(boolean z) {
                    copyOnWrite();
                    ((Android) this.instance).setSdCardPresent(z);
                    return this;
                }

                public Builder setStayOnWhilePluggedIn(boolean z) {
                    copyOnWrite();
                    ((Android) this.instance).setStayOnWhilePluggedIn(z);
                    return this;
                }

                public Builder setTelephonyManagerNetworkType(int i) {
                    copyOnWrite();
                    ((Android) this.instance).setTelephonyManagerNetworkType(i);
                    return this;
                }

                public Builder setUsbConnected(boolean z) {
                    copyOnWrite();
                    ((Android) this.instance).setUsbConnected(z);
                    return this;
                }

                public Builder setVolume(double d) {
                    copyOnWrite();
                    ((Android) this.instance).setVolume(d);
                    return this;
                }

                private Builder() {
                    super(Android.DEFAULT_INSTANCE);
                }

                public Builder setNetworkCapabilityTransports(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builder) {
                    copyOnWrite();
                    ((Android) this.instance).setNetworkCapabilityTransports(builder.build());
                    return this;
                }
            }

            static {
                Android android2 = new Android();
                DEFAULT_INSTANCE = android2;
                GeneratedMessageLite.registerDefaultInstance(Android.class, android2);
            }

            private Android() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAdbEnabled() {
                this.bitField0_ &= -17;
                this.adbEnabled_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAirplaneMode() {
                this.bitField0_ &= -1025;
                this.airplaneMode_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearChargingType() {
                this.bitField0_ &= -8193;
                this.chargingType_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDeviceElapsedRealtime() {
                this.bitField0_ &= -513;
                this.deviceElapsedRealtime_ = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDeviceUpTime() {
                this.bitField0_ &= -257;
                this.deviceUpTime_ = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMaxVolume() {
                this.bitField0_ &= -129;
                this.maxVolume_ = 0.0d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNetworkCapabilityTransports() {
                this.networkCapabilityTransports_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNetworkConnected() {
                this.bitField0_ &= -2;
                this.networkConnected_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNetworkMetered() {
                this.bitField0_ &= -5;
                this.networkMetered_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNetworkType() {
                this.bitField0_ &= -3;
                this.networkType_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSdCardPresent() {
                this.bitField0_ &= -4097;
                this.sdCardPresent_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStayOnWhilePluggedIn() {
                this.bitField0_ &= -2049;
                this.stayOnWhilePluggedIn_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTelephonyManagerNetworkType() {
                this.bitField0_ &= -9;
                this.telephonyManagerNetworkType_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUsbConnected() {
                this.bitField0_ &= -33;
                this.usbConnected_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVolume() {
                this.bitField0_ &= -65;
                this.volume_ = 0.0d;
            }

            public static Android getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeNetworkCapabilityTransports(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports) {
                networkCapabilityTransports.getClass();
                NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports2 = this.networkCapabilityTransports_;
                if (networkCapabilityTransports2 != null && networkCapabilityTransports2 != NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getDefaultInstance()) {
                    this.networkCapabilityTransports_ = NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder(this.networkCapabilityTransports_).mergeFrom((NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder) networkCapabilityTransports).buildPartial();
                } else {
                    this.networkCapabilityTransports_ = networkCapabilityTransports;
                }
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Android parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Android) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Android parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Android> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAdbEnabled(boolean z) {
                this.bitField0_ |= 16;
                this.adbEnabled_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAirplaneMode(boolean z) {
                this.bitField0_ |= 1024;
                this.airplaneMode_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setChargingType(int i) {
                this.bitField0_ |= 8192;
                this.chargingType_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDeviceElapsedRealtime(long j) {
                this.bitField0_ |= 512;
                this.deviceElapsedRealtime_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDeviceUpTime(long j) {
                this.bitField0_ |= 256;
                this.deviceUpTime_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMaxVolume(double d) {
                this.bitField0_ |= 128;
                this.maxVolume_ = d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNetworkCapabilityTransports(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports) {
                networkCapabilityTransports.getClass();
                this.networkCapabilityTransports_ = networkCapabilityTransports;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNetworkConnected(boolean z) {
                this.bitField0_ |= 1;
                this.networkConnected_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNetworkMetered(boolean z) {
                this.bitField0_ |= 4;
                this.networkMetered_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNetworkType(int i) {
                this.bitField0_ |= 2;
                this.networkType_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSdCardPresent(boolean z) {
                this.bitField0_ |= 4096;
                this.sdCardPresent_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStayOnWhilePluggedIn(boolean z) {
                this.bitField0_ |= 2048;
                this.stayOnWhilePluggedIn_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTelephonyManagerNetworkType(int i) {
                this.bitField0_ |= 8;
                this.telephonyManagerNetworkType_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUsbConnected(boolean z) {
                this.bitField0_ |= 32;
                this.usbConnected_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVolume(double d) {
                this.bitField0_ |= 64;
                this.volume_ = d;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C33256a.f90808a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Android();
                    case 2:
                        return new Builder(null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007က\u0006\bက\u0007\tဂ\b\nဂ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u000e\t\u000fင\r", new Object[]{"bitField0_", "networkConnected_", "networkType_", "networkMetered_", "telephonyManagerNetworkType_", "adbEnabled_", "usbConnected_", "volume_", "maxVolume_", "deviceUpTime_", "deviceElapsedRealtime_", "airplaneMode_", "stayOnWhilePluggedIn_", "sdCardPresent_", "networkCapabilityTransports_", "chargingType_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Android> parser = PARSER;
                        if (parser == null) {
                            synchronized (Android.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean getAdbEnabled() {
                return this.adbEnabled_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean getAirplaneMode() {
                return this.airplaneMode_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public int getChargingType() {
                return this.chargingType_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public long getDeviceElapsedRealtime() {
                return this.deviceElapsedRealtime_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public long getDeviceUpTime() {
                return this.deviceUpTime_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public double getMaxVolume() {
                return this.maxVolume_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
                NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports = this.networkCapabilityTransports_;
                if (networkCapabilityTransports == null) {
                    return NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.getDefaultInstance();
                }
                return networkCapabilityTransports;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean getNetworkConnected() {
                return this.networkConnected_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean getNetworkMetered() {
                return this.networkMetered_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public int getNetworkType() {
                return this.networkType_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean getSdCardPresent() {
                return this.sdCardPresent_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean getStayOnWhilePluggedIn() {
                return this.stayOnWhilePluggedIn_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public int getTelephonyManagerNetworkType() {
                return this.telephonyManagerNetworkType_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean getUsbConnected() {
                return this.usbConnected_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public double getVolume() {
                return this.volume_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasAdbEnabled() {
                if ((this.bitField0_ & 16) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasAirplaneMode() {
                if ((this.bitField0_ & 1024) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasChargingType() {
                if ((this.bitField0_ & 8192) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasDeviceElapsedRealtime() {
                if ((this.bitField0_ & 512) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasDeviceUpTime() {
                if ((this.bitField0_ & 256) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasMaxVolume() {
                if ((this.bitField0_ & 128) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasNetworkCapabilityTransports() {
                if (this.networkCapabilityTransports_ != null) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasNetworkConnected() {
                if ((this.bitField0_ & 1) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasNetworkMetered() {
                if ((this.bitField0_ & 4) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasNetworkType() {
                if ((this.bitField0_ & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasSdCardPresent() {
                if ((this.bitField0_ & 4096) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasStayOnWhilePluggedIn() {
                if ((this.bitField0_ & 2048) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasTelephonyManagerNetworkType() {
                if ((this.bitField0_ & 8) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasUsbConnected() {
                if ((this.bitField0_ & 32) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder
            public boolean hasVolume() {
                if ((this.bitField0_ & 64) != 0) {
                    return true;
                }
                return false;
            }

            public static Builder newBuilder(Android android2) {
                return DEFAULT_INSTANCE.createBuilder(android2);
            }

            public static Android parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Android) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Android parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Android parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Android parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Android parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Android parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Android parseFrom(InputStream inputStream) throws IOException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Android parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Android parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Android parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder */
        /* loaded from: classes9.dex */
        public interface AndroidOrBuilder extends MessageLiteOrBuilder {
            boolean getAdbEnabled();

            boolean getAirplaneMode();

            int getChargingType();

            long getDeviceElapsedRealtime();

            long getDeviceUpTime();

            double getMaxVolume();

            NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports();

            boolean getNetworkConnected();

            boolean getNetworkMetered();

            int getNetworkType();

            boolean getSdCardPresent();

            boolean getStayOnWhilePluggedIn();

            int getTelephonyManagerNetworkType();

            boolean getUsbConnected();

            double getVolume();

            boolean hasAdbEnabled();

            boolean hasAirplaneMode();

            boolean hasChargingType();

            boolean hasDeviceElapsedRealtime();

            boolean hasDeviceUpTime();

            boolean hasMaxVolume();

            boolean hasNetworkCapabilityTransports();

            boolean hasNetworkConnected();

            boolean hasNetworkMetered();

            boolean hasNetworkType();

            boolean hasSdCardPresent();

            boolean hasStayOnWhilePluggedIn();

            boolean hasTelephonyManagerNetworkType();

            boolean hasUsbConnected();

            boolean hasVolume();
        }

        /* renamed from: gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder */
        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<DynamicDeviceInfo, Builder> implements DynamicDeviceInfoOrBuilder {
            /* synthetic */ Builder(C33256a c33256a) {
                this();
            }

            public Builder clearAndroid() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearAndroid();
                return this;
            }

            public Builder clearAppActive() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearAppActive();
                return this;
            }

            public Builder clearBatteryLevel() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearBatteryLevel();
                return this;
            }

            public Builder clearBatteryStatus() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearBatteryStatus();
                return this;
            }

            public Builder clearConnectionType() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearConnectionType();
                return this;
            }

            public Builder clearFreeDiskSpace() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearFreeDiskSpace();
                return this;
            }

            public Builder clearFreeRamMemory() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearFreeRamMemory();
                return this;
            }

            public Builder clearIos() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearIos();
                return this;
            }

            public Builder clearLanguage() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearLanguage();
                return this;
            }

            public Builder clearLimitedOpenAdTracking() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearLimitedOpenAdTracking();
                return this;
            }

            public Builder clearLimitedTracking() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearLimitedTracking();
                return this;
            }

            public Builder clearLowPowerMode() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearLowPowerMode();
                return this;
            }

            public Builder clearNetworkOperator() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearNetworkOperator();
                return this;
            }

            public Builder clearNetworkOperatorName() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearNetworkOperatorName();
                return this;
            }

            public Builder clearPlatformSpecific() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearPlatformSpecific();
                return this;
            }

            public Builder clearScreenHeight() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearScreenHeight();
                return this;
            }

            public Builder clearScreenWidth() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearScreenWidth();
                return this;
            }

            public Builder clearTimeZone() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearTimeZone();
                return this;
            }

            public Builder clearTimeZoneOffset() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearTimeZoneOffset();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearUserId();
                return this;
            }

            public Builder clearWiredHeadset() {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).clearWiredHeadset();
                return this;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public Android getAndroid() {
                return ((DynamicDeviceInfo) this.instance).getAndroid();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean getAppActive() {
                return ((DynamicDeviceInfo) this.instance).getAppActive();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public double getBatteryLevel() {
                return ((DynamicDeviceInfo) this.instance).getBatteryLevel();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public int getBatteryStatus() {
                return ((DynamicDeviceInfo) this.instance).getBatteryStatus();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public ConnectionType getConnectionType() {
                return ((DynamicDeviceInfo) this.instance).getConnectionType();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public int getConnectionTypeValue() {
                return ((DynamicDeviceInfo) this.instance).getConnectionTypeValue();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public long getFreeDiskSpace() {
                return ((DynamicDeviceInfo) this.instance).getFreeDiskSpace();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public long getFreeRamMemory() {
                return ((DynamicDeviceInfo) this.instance).getFreeRamMemory();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public Ios getIos() {
                return ((DynamicDeviceInfo) this.instance).getIos();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public String getLanguage() {
                return ((DynamicDeviceInfo) this.instance).getLanguage();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public ByteString getLanguageBytes() {
                return ((DynamicDeviceInfo) this.instance).getLanguageBytes();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean getLimitedOpenAdTracking() {
                return ((DynamicDeviceInfo) this.instance).getLimitedOpenAdTracking();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean getLimitedTracking() {
                return ((DynamicDeviceInfo) this.instance).getLimitedTracking();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean getLowPowerMode() {
                return ((DynamicDeviceInfo) this.instance).getLowPowerMode();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public String getNetworkOperator() {
                return ((DynamicDeviceInfo) this.instance).getNetworkOperator();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public ByteString getNetworkOperatorBytes() {
                return ((DynamicDeviceInfo) this.instance).getNetworkOperatorBytes();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public String getNetworkOperatorName() {
                return ((DynamicDeviceInfo) this.instance).getNetworkOperatorName();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public ByteString getNetworkOperatorNameBytes() {
                return ((DynamicDeviceInfo) this.instance).getNetworkOperatorNameBytes();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public PlatformSpecificCase getPlatformSpecificCase() {
                return ((DynamicDeviceInfo) this.instance).getPlatformSpecificCase();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public int getScreenHeight() {
                return ((DynamicDeviceInfo) this.instance).getScreenHeight();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public int getScreenWidth() {
                return ((DynamicDeviceInfo) this.instance).getScreenWidth();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public String getTimeZone() {
                return ((DynamicDeviceInfo) this.instance).getTimeZone();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public ByteString getTimeZoneBytes() {
                return ((DynamicDeviceInfo) this.instance).getTimeZoneBytes();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public long getTimeZoneOffset() {
                return ((DynamicDeviceInfo) this.instance).getTimeZoneOffset();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public String getUserId() {
                return ((DynamicDeviceInfo) this.instance).getUserId();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public ByteString getUserIdBytes() {
                return ((DynamicDeviceInfo) this.instance).getUserIdBytes();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean getWiredHeadset() {
                return ((DynamicDeviceInfo) this.instance).getWiredHeadset();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasAndroid() {
                return ((DynamicDeviceInfo) this.instance).hasAndroid();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasAppActive() {
                return ((DynamicDeviceInfo) this.instance).hasAppActive();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasBatteryLevel() {
                return ((DynamicDeviceInfo) this.instance).hasBatteryLevel();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasBatteryStatus() {
                return ((DynamicDeviceInfo) this.instance).hasBatteryStatus();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasConnectionType() {
                return ((DynamicDeviceInfo) this.instance).hasConnectionType();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasFreeDiskSpace() {
                return ((DynamicDeviceInfo) this.instance).hasFreeDiskSpace();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasFreeRamMemory() {
                return ((DynamicDeviceInfo) this.instance).hasFreeRamMemory();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasIos() {
                return ((DynamicDeviceInfo) this.instance).hasIos();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasLanguage() {
                return ((DynamicDeviceInfo) this.instance).hasLanguage();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasLimitedOpenAdTracking() {
                return ((DynamicDeviceInfo) this.instance).hasLimitedOpenAdTracking();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasLimitedTracking() {
                return ((DynamicDeviceInfo) this.instance).hasLimitedTracking();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasLowPowerMode() {
                return ((DynamicDeviceInfo) this.instance).hasLowPowerMode();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasNetworkOperator() {
                return ((DynamicDeviceInfo) this.instance).hasNetworkOperator();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasNetworkOperatorName() {
                return ((DynamicDeviceInfo) this.instance).hasNetworkOperatorName();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasScreenHeight() {
                return ((DynamicDeviceInfo) this.instance).hasScreenHeight();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasScreenWidth() {
                return ((DynamicDeviceInfo) this.instance).hasScreenWidth();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasTimeZone() {
                return ((DynamicDeviceInfo) this.instance).hasTimeZone();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasTimeZoneOffset() {
                return ((DynamicDeviceInfo) this.instance).hasTimeZoneOffset();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasUserId() {
                return ((DynamicDeviceInfo) this.instance).hasUserId();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
            public boolean hasWiredHeadset() {
                return ((DynamicDeviceInfo) this.instance).hasWiredHeadset();
            }

            public Builder mergeAndroid(Android android2) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).mergeAndroid(android2);
                return this;
            }

            public Builder mergeIos(Ios ios) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).mergeIos(ios);
                return this;
            }

            public Builder setAndroid(Android android2) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setAndroid(android2);
                return this;
            }

            public Builder setAppActive(boolean z) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setAppActive(z);
                return this;
            }

            public Builder setBatteryLevel(double d) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setBatteryLevel(d);
                return this;
            }

            public Builder setBatteryStatus(int i) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setBatteryStatus(i);
                return this;
            }

            public Builder setConnectionType(ConnectionType connectionType) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setConnectionType(connectionType);
                return this;
            }

            public Builder setConnectionTypeValue(int i) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setConnectionTypeValue(i);
                return this;
            }

            public Builder setFreeDiskSpace(long j) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setFreeDiskSpace(j);
                return this;
            }

            public Builder setFreeRamMemory(long j) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setFreeRamMemory(j);
                return this;
            }

            public Builder setIos(Ios ios) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setIos(ios);
                return this;
            }

            public Builder setLanguage(String str) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setLanguage(str);
                return this;
            }

            public Builder setLanguageBytes(ByteString byteString) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setLanguageBytes(byteString);
                return this;
            }

            public Builder setLimitedOpenAdTracking(boolean z) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setLimitedOpenAdTracking(z);
                return this;
            }

            public Builder setLimitedTracking(boolean z) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setLimitedTracking(z);
                return this;
            }

            public Builder setLowPowerMode(boolean z) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setLowPowerMode(z);
                return this;
            }

            public Builder setNetworkOperator(String str) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setNetworkOperator(str);
                return this;
            }

            public Builder setNetworkOperatorBytes(ByteString byteString) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setNetworkOperatorBytes(byteString);
                return this;
            }

            public Builder setNetworkOperatorName(String str) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setNetworkOperatorName(str);
                return this;
            }

            public Builder setNetworkOperatorNameBytes(ByteString byteString) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setNetworkOperatorNameBytes(byteString);
                return this;
            }

            public Builder setScreenHeight(int i) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setScreenHeight(i);
                return this;
            }

            public Builder setScreenWidth(int i) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setScreenWidth(i);
                return this;
            }

            public Builder setTimeZone(String str) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setTimeZone(str);
                return this;
            }

            public Builder setTimeZoneBytes(ByteString byteString) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setTimeZoneBytes(byteString);
                return this;
            }

            public Builder setTimeZoneOffset(long j) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setTimeZoneOffset(j);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setWiredHeadset(boolean z) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setWiredHeadset(z);
                return this;
            }

            private Builder() {
                super(DynamicDeviceInfo.DEFAULT_INSTANCE);
            }

            public Builder setAndroid(Android.Builder builder) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setAndroid(builder.build());
                return this;
            }

            public Builder setIos(Ios.Builder builder) {
                copyOnWrite();
                ((DynamicDeviceInfo) this.instance).setIos(builder.build());
                return this;
            }
        }

        /* renamed from: gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios */
        /* loaded from: classes9.dex */
        public static final class Ios extends GeneratedMessageLite<Ios, Builder> implements IosOrBuilder {
            public static final int CURRENT_RADIO_ACCESS_TECHNOLOGY_FIELD_NUMBER = 1;
            public static final int CURRENT_UI_THEME_FIELD_NUMBER = 5;
            private static final Ios DEFAULT_INSTANCE;
            public static final int DEVICE_NAME_FIELD_NUMBER = 6;
            public static final int DEVICE_UP_TIME_WITHOUT_SLEEP_FIELD_NUMBER = 10;
            public static final int DEVICE_UP_TIME_WITH_SLEEP_FIELD_NUMBER = 9;
            public static final int LOCALE_LIST_FIELD_NUMBER = 4;
            public static final int NETWORK_REACHABILITY_FLAGS_FIELD_NUMBER = 2;
            public static final int NW_PATH_INTERFACES_FIELD_NUMBER = 3;
            private static volatile Parser<Ios> PARSER = null;
            public static final int TRACKING_AUTH_STATUS_FIELD_NUMBER = 8;
            public static final int VOLUME_FIELD_NUMBER = 7;
            private int bitField0_;
            private int currentUiTheme_;
            private long deviceUpTimeWithSleep_;
            private long deviceUpTimeWithoutSleep_;
            private int networkReachabilityFlags_;
            private int trackingAuthStatus_;
            private double volume_;
            private String currentRadioAccessTechnology_ = "";
            private Internal.ProtobufList<String> nwPathInterfaces_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<String> localeList_ = GeneratedMessageLite.emptyProtobufList();
            private String deviceName_ = "";

            /* renamed from: gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder */
            /* loaded from: classes9.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<Ios, Builder> implements IosOrBuilder {
                /* synthetic */ Builder(C33256a c33256a) {
                    this();
                }

                public Builder addAllLocaleList(Iterable<String> iterable) {
                    copyOnWrite();
                    ((Ios) this.instance).addAllLocaleList(iterable);
                    return this;
                }

                public Builder addAllNwPathInterfaces(Iterable<String> iterable) {
                    copyOnWrite();
                    ((Ios) this.instance).addAllNwPathInterfaces(iterable);
                    return this;
                }

                public Builder addLocaleList(String str) {
                    copyOnWrite();
                    ((Ios) this.instance).addLocaleList(str);
                    return this;
                }

                public Builder addLocaleListBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Ios) this.instance).addLocaleListBytes(byteString);
                    return this;
                }

                public Builder addNwPathInterfaces(String str) {
                    copyOnWrite();
                    ((Ios) this.instance).addNwPathInterfaces(str);
                    return this;
                }

                public Builder addNwPathInterfacesBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Ios) this.instance).addNwPathInterfacesBytes(byteString);
                    return this;
                }

                public Builder clearCurrentRadioAccessTechnology() {
                    copyOnWrite();
                    ((Ios) this.instance).clearCurrentRadioAccessTechnology();
                    return this;
                }

                public Builder clearCurrentUiTheme() {
                    copyOnWrite();
                    ((Ios) this.instance).clearCurrentUiTheme();
                    return this;
                }

                public Builder clearDeviceName() {
                    copyOnWrite();
                    ((Ios) this.instance).clearDeviceName();
                    return this;
                }

                public Builder clearDeviceUpTimeWithSleep() {
                    copyOnWrite();
                    ((Ios) this.instance).clearDeviceUpTimeWithSleep();
                    return this;
                }

                public Builder clearDeviceUpTimeWithoutSleep() {
                    copyOnWrite();
                    ((Ios) this.instance).clearDeviceUpTimeWithoutSleep();
                    return this;
                }

                public Builder clearLocaleList() {
                    copyOnWrite();
                    ((Ios) this.instance).clearLocaleList();
                    return this;
                }

                public Builder clearNetworkReachabilityFlags() {
                    copyOnWrite();
                    ((Ios) this.instance).clearNetworkReachabilityFlags();
                    return this;
                }

                public Builder clearNwPathInterfaces() {
                    copyOnWrite();
                    ((Ios) this.instance).clearNwPathInterfaces();
                    return this;
                }

                public Builder clearTrackingAuthStatus() {
                    copyOnWrite();
                    ((Ios) this.instance).clearTrackingAuthStatus();
                    return this;
                }

                public Builder clearVolume() {
                    copyOnWrite();
                    ((Ios) this.instance).clearVolume();
                    return this;
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public String getCurrentRadioAccessTechnology() {
                    return ((Ios) this.instance).getCurrentRadioAccessTechnology();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public ByteString getCurrentRadioAccessTechnologyBytes() {
                    return ((Ios) this.instance).getCurrentRadioAccessTechnologyBytes();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public int getCurrentUiTheme() {
                    return ((Ios) this.instance).getCurrentUiTheme();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public String getDeviceName() {
                    return ((Ios) this.instance).getDeviceName();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public ByteString getDeviceNameBytes() {
                    return ((Ios) this.instance).getDeviceNameBytes();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public long getDeviceUpTimeWithSleep() {
                    return ((Ios) this.instance).getDeviceUpTimeWithSleep();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public long getDeviceUpTimeWithoutSleep() {
                    return ((Ios) this.instance).getDeviceUpTimeWithoutSleep();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public String getLocaleList(int i) {
                    return ((Ios) this.instance).getLocaleList(i);
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public ByteString getLocaleListBytes(int i) {
                    return ((Ios) this.instance).getLocaleListBytes(i);
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public int getLocaleListCount() {
                    return ((Ios) this.instance).getLocaleListCount();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public List<String> getLocaleListList() {
                    return Collections.unmodifiableList(((Ios) this.instance).getLocaleListList());
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public int getNetworkReachabilityFlags() {
                    return ((Ios) this.instance).getNetworkReachabilityFlags();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public String getNwPathInterfaces(int i) {
                    return ((Ios) this.instance).getNwPathInterfaces(i);
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public ByteString getNwPathInterfacesBytes(int i) {
                    return ((Ios) this.instance).getNwPathInterfacesBytes(i);
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public int getNwPathInterfacesCount() {
                    return ((Ios) this.instance).getNwPathInterfacesCount();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public List<String> getNwPathInterfacesList() {
                    return Collections.unmodifiableList(((Ios) this.instance).getNwPathInterfacesList());
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public int getTrackingAuthStatus() {
                    return ((Ios) this.instance).getTrackingAuthStatus();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public double getVolume() {
                    return ((Ios) this.instance).getVolume();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public boolean hasCurrentRadioAccessTechnology() {
                    return ((Ios) this.instance).hasCurrentRadioAccessTechnology();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public boolean hasCurrentUiTheme() {
                    return ((Ios) this.instance).hasCurrentUiTheme();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public boolean hasDeviceName() {
                    return ((Ios) this.instance).hasDeviceName();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public boolean hasDeviceUpTimeWithSleep() {
                    return ((Ios) this.instance).hasDeviceUpTimeWithSleep();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public boolean hasDeviceUpTimeWithoutSleep() {
                    return ((Ios) this.instance).hasDeviceUpTimeWithoutSleep();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public boolean hasNetworkReachabilityFlags() {
                    return ((Ios) this.instance).hasNetworkReachabilityFlags();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public boolean hasTrackingAuthStatus() {
                    return ((Ios) this.instance).hasTrackingAuthStatus();
                }

                @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
                public boolean hasVolume() {
                    return ((Ios) this.instance).hasVolume();
                }

                public Builder setCurrentRadioAccessTechnology(String str) {
                    copyOnWrite();
                    ((Ios) this.instance).setCurrentRadioAccessTechnology(str);
                    return this;
                }

                public Builder setCurrentRadioAccessTechnologyBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Ios) this.instance).setCurrentRadioAccessTechnologyBytes(byteString);
                    return this;
                }

                public Builder setCurrentUiTheme(int i) {
                    copyOnWrite();
                    ((Ios) this.instance).setCurrentUiTheme(i);
                    return this;
                }

                public Builder setDeviceName(String str) {
                    copyOnWrite();
                    ((Ios) this.instance).setDeviceName(str);
                    return this;
                }

                public Builder setDeviceNameBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Ios) this.instance).setDeviceNameBytes(byteString);
                    return this;
                }

                public Builder setDeviceUpTimeWithSleep(long j) {
                    copyOnWrite();
                    ((Ios) this.instance).setDeviceUpTimeWithSleep(j);
                    return this;
                }

                public Builder setDeviceUpTimeWithoutSleep(long j) {
                    copyOnWrite();
                    ((Ios) this.instance).setDeviceUpTimeWithoutSleep(j);
                    return this;
                }

                public Builder setLocaleList(int i, String str) {
                    copyOnWrite();
                    ((Ios) this.instance).setLocaleList(i, str);
                    return this;
                }

                public Builder setNetworkReachabilityFlags(int i) {
                    copyOnWrite();
                    ((Ios) this.instance).setNetworkReachabilityFlags(i);
                    return this;
                }

                public Builder setNwPathInterfaces(int i, String str) {
                    copyOnWrite();
                    ((Ios) this.instance).setNwPathInterfaces(i, str);
                    return this;
                }

                public Builder setTrackingAuthStatus(int i) {
                    copyOnWrite();
                    ((Ios) this.instance).setTrackingAuthStatus(i);
                    return this;
                }

                public Builder setVolume(double d) {
                    copyOnWrite();
                    ((Ios) this.instance).setVolume(d);
                    return this;
                }

                private Builder() {
                    super(Ios.DEFAULT_INSTANCE);
                }
            }

            static {
                Ios ios = new Ios();
                DEFAULT_INSTANCE = ios;
                GeneratedMessageLite.registerDefaultInstance(Ios.class, ios);
            }

            private Ios() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllLocaleList(Iterable<String> iterable) {
                ensureLocaleListIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.localeList_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllNwPathInterfaces(Iterable<String> iterable) {
                ensureNwPathInterfacesIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.nwPathInterfaces_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addLocaleList(String str) {
                str.getClass();
                ensureLocaleListIsMutable();
                this.localeList_.add(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addLocaleListBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                ensureLocaleListIsMutable();
                this.localeList_.add(byteString.toStringUtf8());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addNwPathInterfaces(String str) {
                str.getClass();
                ensureNwPathInterfacesIsMutable();
                this.nwPathInterfaces_.add(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addNwPathInterfacesBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                ensureNwPathInterfacesIsMutable();
                this.nwPathInterfaces_.add(byteString.toStringUtf8());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCurrentRadioAccessTechnology() {
                this.bitField0_ &= -2;
                this.currentRadioAccessTechnology_ = getDefaultInstance().getCurrentRadioAccessTechnology();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCurrentUiTheme() {
                this.bitField0_ &= -5;
                this.currentUiTheme_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDeviceName() {
                this.bitField0_ &= -9;
                this.deviceName_ = getDefaultInstance().getDeviceName();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDeviceUpTimeWithSleep() {
                this.bitField0_ &= -65;
                this.deviceUpTimeWithSleep_ = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDeviceUpTimeWithoutSleep() {
                this.bitField0_ &= -129;
                this.deviceUpTimeWithoutSleep_ = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLocaleList() {
                this.localeList_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNetworkReachabilityFlags() {
                this.bitField0_ &= -3;
                this.networkReachabilityFlags_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNwPathInterfaces() {
                this.nwPathInterfaces_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTrackingAuthStatus() {
                this.bitField0_ &= -33;
                this.trackingAuthStatus_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVolume() {
                this.bitField0_ &= -17;
                this.volume_ = 0.0d;
            }

            private void ensureLocaleListIsMutable() {
                Internal.ProtobufList<String> protobufList = this.localeList_;
                if (!protobufList.isModifiable()) {
                    this.localeList_ = GeneratedMessageLite.mutableCopy(protobufList);
                }
            }

            private void ensureNwPathInterfacesIsMutable() {
                Internal.ProtobufList<String> protobufList = this.nwPathInterfaces_;
                if (!protobufList.isModifiable()) {
                    this.nwPathInterfaces_ = GeneratedMessageLite.mutableCopy(protobufList);
                }
            }

            public static Ios getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Ios parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Ios) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Ios parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Ios> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCurrentRadioAccessTechnology(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.currentRadioAccessTechnology_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCurrentRadioAccessTechnologyBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.currentRadioAccessTechnology_ = byteString.toStringUtf8();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCurrentUiTheme(int i) {
                this.bitField0_ |= 4;
                this.currentUiTheme_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDeviceName(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.deviceName_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDeviceNameBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.deviceName_ = byteString.toStringUtf8();
                this.bitField0_ |= 8;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDeviceUpTimeWithSleep(long j) {
                this.bitField0_ |= 64;
                this.deviceUpTimeWithSleep_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDeviceUpTimeWithoutSleep(long j) {
                this.bitField0_ |= 128;
                this.deviceUpTimeWithoutSleep_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLocaleList(int i, String str) {
                str.getClass();
                ensureLocaleListIsMutable();
                this.localeList_.set(i, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNetworkReachabilityFlags(int i) {
                this.bitField0_ |= 2;
                this.networkReachabilityFlags_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNwPathInterfaces(int i, String str) {
                str.getClass();
                ensureNwPathInterfacesIsMutable();
                this.nwPathInterfaces_.set(i, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTrackingAuthStatus(int i) {
                this.bitField0_ |= 32;
                this.trackingAuthStatus_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVolume(double d) {
                this.bitField0_ |= 16;
                this.volume_ = d;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C33256a.f90808a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Ios();
                    case 2:
                        return new Builder(null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ለ\u0000\u0002ဋ\u0001\u0003Ț\u0004Ț\u0005င\u0002\u0006ለ\u0003\u0007က\u0004\bင\u0005\tဂ\u0006\nဂ\u0007", new Object[]{"bitField0_", "currentRadioAccessTechnology_", "networkReachabilityFlags_", "nwPathInterfaces_", "localeList_", "currentUiTheme_", "deviceName_", "volume_", "trackingAuthStatus_", "deviceUpTimeWithSleep_", "deviceUpTimeWithoutSleep_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Ios> parser = PARSER;
                        if (parser == null) {
                            synchronized (Ios.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public String getCurrentRadioAccessTechnology() {
                return this.currentRadioAccessTechnology_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public ByteString getCurrentRadioAccessTechnologyBytes() {
                return ByteString.copyFromUtf8(this.currentRadioAccessTechnology_);
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public int getCurrentUiTheme() {
                return this.currentUiTheme_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public String getDeviceName() {
                return this.deviceName_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public ByteString getDeviceNameBytes() {
                return ByteString.copyFromUtf8(this.deviceName_);
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public long getDeviceUpTimeWithSleep() {
                return this.deviceUpTimeWithSleep_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public long getDeviceUpTimeWithoutSleep() {
                return this.deviceUpTimeWithoutSleep_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public String getLocaleList(int i) {
                return this.localeList_.get(i);
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public ByteString getLocaleListBytes(int i) {
                return ByteString.copyFromUtf8(this.localeList_.get(i));
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public int getLocaleListCount() {
                return this.localeList_.size();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public List<String> getLocaleListList() {
                return this.localeList_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public int getNetworkReachabilityFlags() {
                return this.networkReachabilityFlags_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public String getNwPathInterfaces(int i) {
                return this.nwPathInterfaces_.get(i);
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public ByteString getNwPathInterfacesBytes(int i) {
                return ByteString.copyFromUtf8(this.nwPathInterfaces_.get(i));
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public int getNwPathInterfacesCount() {
                return this.nwPathInterfaces_.size();
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public List<String> getNwPathInterfacesList() {
                return this.nwPathInterfaces_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public int getTrackingAuthStatus() {
                return this.trackingAuthStatus_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public double getVolume() {
                return this.volume_;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public boolean hasCurrentRadioAccessTechnology() {
                if ((this.bitField0_ & 1) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public boolean hasCurrentUiTheme() {
                if ((this.bitField0_ & 4) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public boolean hasDeviceName() {
                if ((this.bitField0_ & 8) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public boolean hasDeviceUpTimeWithSleep() {
                if ((this.bitField0_ & 64) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public boolean hasDeviceUpTimeWithoutSleep() {
                if ((this.bitField0_ & 128) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public boolean hasNetworkReachabilityFlags() {
                if ((this.bitField0_ & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public boolean hasTrackingAuthStatus() {
                if ((this.bitField0_ & 32) != 0) {
                    return true;
                }
                return false;
            }

            @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.IosOrBuilder
            public boolean hasVolume() {
                if ((this.bitField0_ & 16) != 0) {
                    return true;
                }
                return false;
            }

            public static Builder newBuilder(Ios ios) {
                return DEFAULT_INSTANCE.createBuilder(ios);
            }

            public static Ios parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ios) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Ios parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Ios parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Ios parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Ios parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Ios parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Ios parseFrom(InputStream inputStream) throws IOException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Ios parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Ios parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Ios parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder */
        /* loaded from: classes9.dex */
        public interface IosOrBuilder extends MessageLiteOrBuilder {
            String getCurrentRadioAccessTechnology();

            ByteString getCurrentRadioAccessTechnologyBytes();

            int getCurrentUiTheme();

            String getDeviceName();

            ByteString getDeviceNameBytes();

            long getDeviceUpTimeWithSleep();

            long getDeviceUpTimeWithoutSleep();

            String getLocaleList(int i);

            ByteString getLocaleListBytes(int i);

            int getLocaleListCount();

            List<String> getLocaleListList();

            int getNetworkReachabilityFlags();

            String getNwPathInterfaces(int i);

            ByteString getNwPathInterfacesBytes(int i);

            int getNwPathInterfacesCount();

            List<String> getNwPathInterfacesList();

            int getTrackingAuthStatus();

            double getVolume();

            boolean hasCurrentRadioAccessTechnology();

            boolean hasCurrentUiTheme();

            boolean hasDeviceName();

            boolean hasDeviceUpTimeWithSleep();

            boolean hasDeviceUpTimeWithoutSleep();

            boolean hasNetworkReachabilityFlags();

            boolean hasTrackingAuthStatus();

            boolean hasVolume();
        }

        /* renamed from: gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$PlatformSpecificCase */
        /* loaded from: classes9.dex */
        public enum PlatformSpecificCase {
            ANDROID(12),
            IOS(13),
            PLATFORMSPECIFIC_NOT_SET(0);
            
            private final int value;

            PlatformSpecificCase(int i) {
                this.value = i;
            }

            public static PlatformSpecificCase forNumber(int i) {
                if (i != 0) {
                    if (i != 12) {
                        if (i != 13) {
                            return null;
                        }
                        return IOS;
                    }
                    return ANDROID;
                }
                return PLATFORMSPECIFIC_NOT_SET;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static PlatformSpecificCase valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            DynamicDeviceInfo dynamicDeviceInfo = new DynamicDeviceInfo();
            DEFAULT_INSTANCE = dynamicDeviceInfo;
            GeneratedMessageLite.registerDefaultInstance(DynamicDeviceInfo.class, dynamicDeviceInfo);
        }

        private DynamicDeviceInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAndroid() {
            if (this.platformSpecificCase_ == 12) {
                this.platformSpecificCase_ = 0;
                this.platformSpecific_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppActive() {
            this.bitField0_ &= -8193;
            this.appActive_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatteryLevel() {
            this.bitField0_ &= -1025;
            this.batteryLevel_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatteryStatus() {
            this.bitField0_ &= -2049;
            this.batteryStatus_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectionType() {
            this.bitField0_ &= -4097;
            this.connectionType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFreeDiskSpace() {
            this.bitField0_ &= -9;
            this.freeDiskSpace_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFreeRamMemory() {
            this.bitField0_ &= -17;
            this.freeRamMemory_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIos() {
            if (this.platformSpecificCase_ == 13) {
                this.platformSpecificCase_ = 0;
                this.platformSpecific_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLanguage() {
            this.bitField0_ &= -2;
            this.language_ = getDefaultInstance().getLanguage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLimitedOpenAdTracking() {
            this.bitField0_ &= -513;
            this.limitedOpenAdTracking_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLimitedTracking() {
            this.bitField0_ &= -257;
            this.limitedTracking_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLowPowerMode() {
            this.bitField0_ &= -16385;
            this.lowPowerMode_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkOperator() {
            this.bitField0_ &= -3;
            this.networkOperator_ = getDefaultInstance().getNetworkOperator();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkOperatorName() {
            this.bitField0_ &= -5;
            this.networkOperatorName_ = getDefaultInstance().getNetworkOperatorName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlatformSpecific() {
            this.platformSpecificCase_ = 0;
            this.platformSpecific_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenHeight() {
            this.bitField0_ &= -131073;
            this.screenHeight_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenWidth() {
            this.bitField0_ &= -65537;
            this.screenWidth_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeZone() {
            this.bitField0_ &= -65;
            this.timeZone_ = getDefaultInstance().getTimeZone();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeZoneOffset() {
            this.bitField0_ &= -129;
            this.timeZoneOffset_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.bitField0_ &= -32769;
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWiredHeadset() {
            this.bitField0_ &= -33;
            this.wiredHeadset_ = false;
        }

        public static DynamicDeviceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAndroid(Android android2) {
            android2.getClass();
            if (this.platformSpecificCase_ == 12 && this.platformSpecific_ != Android.getDefaultInstance()) {
                this.platformSpecific_ = Android.newBuilder((Android) this.platformSpecific_).mergeFrom((Android.Builder) android2).buildPartial();
            } else {
                this.platformSpecific_ = android2;
            }
            this.platformSpecificCase_ = 12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeIos(Ios ios) {
            ios.getClass();
            if (this.platformSpecificCase_ == 13 && this.platformSpecific_ != Ios.getDefaultInstance()) {
                this.platformSpecific_ = Ios.newBuilder((Ios) this.platformSpecific_).mergeFrom((Ios.Builder) ios).buildPartial();
            } else {
                this.platformSpecific_ = ios;
            }
            this.platformSpecificCase_ = 13;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DynamicDeviceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DynamicDeviceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DynamicDeviceInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAndroid(Android android2) {
            android2.getClass();
            this.platformSpecific_ = android2;
            this.platformSpecificCase_ = 12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppActive(boolean z) {
            this.bitField0_ |= 8192;
            this.appActive_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatteryLevel(double d) {
            this.bitField0_ |= 1024;
            this.batteryLevel_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatteryStatus(int i) {
            this.bitField0_ |= 2048;
            this.batteryStatus_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionType(ConnectionType connectionType) {
            this.connectionType_ = connectionType.getNumber();
            this.bitField0_ |= 4096;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeValue(int i) {
            this.bitField0_ |= 4096;
            this.connectionType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFreeDiskSpace(long j) {
            this.bitField0_ |= 8;
            this.freeDiskSpace_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFreeRamMemory(long j) {
            this.bitField0_ |= 16;
            this.freeRamMemory_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIos(Ios ios) {
            ios.getClass();
            this.platformSpecific_ = ios;
            this.platformSpecificCase_ = 13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguage(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.language_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguageBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.language_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLimitedOpenAdTracking(boolean z) {
            this.bitField0_ |= 512;
            this.limitedOpenAdTracking_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLimitedTracking(boolean z) {
            this.bitField0_ |= 256;
            this.limitedTracking_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLowPowerMode(boolean z) {
            this.bitField0_ |= 16384;
            this.lowPowerMode_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkOperator(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.networkOperator_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkOperatorBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.networkOperator_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkOperatorName(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.networkOperatorName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkOperatorNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.networkOperatorName_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenHeight(int i) {
            this.bitField0_ |= 131072;
            this.screenHeight_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenWidth(int i) {
            this.bitField0_ |= 65536;
            this.screenWidth_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeZone(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.timeZone_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeZoneBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.timeZone_ = byteString.toStringUtf8();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeZoneOffset(long j) {
            this.bitField0_ |= 128;
            this.timeZoneOffset_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.bitField0_ |= 32768;
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWiredHeadset(boolean z) {
            this.bitField0_ |= 32;
            this.wiredHeadset_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C33256a.f90808a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DynamicDeviceInfo();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0001\u0001\u0001\u0015\u0014\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0005ဂ\u0003\u0006ဂ\u0004\u0007ဇ\u0005\bለ\u0006\tဂ\u0007\nဇ\b\u000bဇ\t\f<\u0000\r<\u0000\u000eက\n\u000fင\u000b\u0010ဌ\f\u0011ဇ\r\u0012ဇ\u000e\u0013ለ\u000f\u0014ဋ\u0010\u0015ဋ\u0011", new Object[]{"platformSpecific_", "platformSpecificCase_", "bitField0_", "language_", "networkOperator_", "networkOperatorName_", "freeDiskSpace_", "freeRamMemory_", "wiredHeadset_", "timeZone_", "timeZoneOffset_", "limitedTracking_", "limitedOpenAdTracking_", Android.class, Ios.class, "batteryLevel_", "batteryStatus_", "connectionType_", "appActive_", "lowPowerMode_", "userId_", "screenWidth_", "screenHeight_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DynamicDeviceInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (DynamicDeviceInfo.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public Android getAndroid() {
            if (this.platformSpecificCase_ == 12) {
                return (Android) this.platformSpecific_;
            }
            return Android.getDefaultInstance();
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean getAppActive() {
            return this.appActive_;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public double getBatteryLevel() {
            return this.batteryLevel_;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public int getBatteryStatus() {
            return this.batteryStatus_;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public ConnectionType getConnectionType() {
            ConnectionType forNumber = ConnectionType.forNumber(this.connectionType_);
            if (forNumber == null) {
                return ConnectionType.UNRECOGNIZED;
            }
            return forNumber;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public int getConnectionTypeValue() {
            return this.connectionType_;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public long getFreeDiskSpace() {
            return this.freeDiskSpace_;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public long getFreeRamMemory() {
            return this.freeRamMemory_;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public Ios getIos() {
            if (this.platformSpecificCase_ == 13) {
                return (Ios) this.platformSpecific_;
            }
            return Ios.getDefaultInstance();
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public String getLanguage() {
            return this.language_;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public ByteString getLanguageBytes() {
            return ByteString.copyFromUtf8(this.language_);
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean getLimitedOpenAdTracking() {
            return this.limitedOpenAdTracking_;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean getLimitedTracking() {
            return this.limitedTracking_;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean getLowPowerMode() {
            return this.lowPowerMode_;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public String getNetworkOperator() {
            return this.networkOperator_;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public ByteString getNetworkOperatorBytes() {
            return ByteString.copyFromUtf8(this.networkOperator_);
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public String getNetworkOperatorName() {
            return this.networkOperatorName_;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public ByteString getNetworkOperatorNameBytes() {
            return ByteString.copyFromUtf8(this.networkOperatorName_);
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public PlatformSpecificCase getPlatformSpecificCase() {
            return PlatformSpecificCase.forNumber(this.platformSpecificCase_);
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public int getScreenHeight() {
            return this.screenHeight_;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public int getScreenWidth() {
            return this.screenWidth_;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public String getTimeZone() {
            return this.timeZone_;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public ByteString getTimeZoneBytes() {
            return ByteString.copyFromUtf8(this.timeZone_);
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public long getTimeZoneOffset() {
            return this.timeZoneOffset_;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean getWiredHeadset() {
            return this.wiredHeadset_;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasAndroid() {
            if (this.platformSpecificCase_ == 12) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasAppActive() {
            if ((this.bitField0_ & 8192) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasBatteryLevel() {
            if ((this.bitField0_ & 1024) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasBatteryStatus() {
            if ((this.bitField0_ & 2048) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasConnectionType() {
            if ((this.bitField0_ & 4096) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasFreeDiskSpace() {
            if ((this.bitField0_ & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasFreeRamMemory() {
            if ((this.bitField0_ & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasIos() {
            if (this.platformSpecificCase_ == 13) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasLanguage() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasLimitedOpenAdTracking() {
            if ((this.bitField0_ & 512) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasLimitedTracking() {
            if ((this.bitField0_ & 256) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasLowPowerMode() {
            if ((this.bitField0_ & 16384) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasNetworkOperator() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasNetworkOperatorName() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasScreenHeight() {
            if ((this.bitField0_ & 131072) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasScreenWidth() {
            if ((this.bitField0_ & 65536) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasTimeZone() {
            if ((this.bitField0_ & 64) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasTimeZoneOffset() {
            if ((this.bitField0_ & 128) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasUserId() {
            if ((this.bitField0_ & 32768) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder
        public boolean hasWiredHeadset() {
            if ((this.bitField0_ & 32) != 0) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(DynamicDeviceInfo dynamicDeviceInfo) {
            return DEFAULT_INSTANCE.createBuilder(dynamicDeviceInfo);
        }

        public static DynamicDeviceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DynamicDeviceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DynamicDeviceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DynamicDeviceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DynamicDeviceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DynamicDeviceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DynamicDeviceInfo parseFrom(InputStream inputStream) throws IOException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DynamicDeviceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DynamicDeviceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DynamicDeviceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder */
    /* loaded from: classes9.dex */
    public interface DynamicDeviceInfoOrBuilder extends MessageLiteOrBuilder {
        DynamicDeviceInfo.Android getAndroid();

        boolean getAppActive();

        double getBatteryLevel();

        int getBatteryStatus();

        ConnectionType getConnectionType();

        int getConnectionTypeValue();

        long getFreeDiskSpace();

        long getFreeRamMemory();

        DynamicDeviceInfo.Ios getIos();

        String getLanguage();

        ByteString getLanguageBytes();

        boolean getLimitedOpenAdTracking();

        boolean getLimitedTracking();

        boolean getLowPowerMode();

        String getNetworkOperator();

        ByteString getNetworkOperatorBytes();

        String getNetworkOperatorName();

        ByteString getNetworkOperatorNameBytes();

        DynamicDeviceInfo.PlatformSpecificCase getPlatformSpecificCase();

        int getScreenHeight();

        int getScreenWidth();

        String getTimeZone();

        ByteString getTimeZoneBytes();

        long getTimeZoneOffset();

        String getUserId();

        ByteString getUserIdBytes();

        boolean getWiredHeadset();

        boolean hasAndroid();

        boolean hasAppActive();

        boolean hasBatteryLevel();

        boolean hasBatteryStatus();

        boolean hasConnectionType();

        boolean hasFreeDiskSpace();

        boolean hasFreeRamMemory();

        boolean hasIos();

        boolean hasLanguage();

        boolean hasLimitedOpenAdTracking();

        boolean hasLimitedTracking();

        boolean hasLowPowerMode();

        boolean hasNetworkOperator();

        boolean hasNetworkOperatorName();

        boolean hasScreenHeight();

        boolean hasScreenWidth();

        boolean hasTimeZone();

        boolean hasTimeZoneOffset();

        boolean hasUserId();

        boolean hasWiredHeadset();
    }

    /* renamed from: gatewayprotocol.v1.DynamicDeviceInfoOuterClass$a */
    /* loaded from: classes9.dex */
    static /* synthetic */ class C33256a {

        /* renamed from: a */
        static final /* synthetic */ int[] f90808a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f90808a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90808a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90808a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90808a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90808a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90808a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f90808a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private DynamicDeviceInfoOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
