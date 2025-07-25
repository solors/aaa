package gatewayprotocol.p687v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass */
/* loaded from: classes9.dex */
public final class NetworkCapabilityTransportsOuterClass {

    /* renamed from: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports */
    /* loaded from: classes9.dex */
    public static final class NetworkCapabilityTransports extends GeneratedMessageLite<NetworkCapabilityTransports, Builder> implements NetworkCapabilityTransportsOrBuilder {
        public static final int BLUETOOTH_FIELD_NUMBER = 1;
        public static final int CELLULAR_FIELD_NUMBER = 2;
        private static final NetworkCapabilityTransports DEFAULT_INSTANCE;
        public static final int ETHERNET_FIELD_NUMBER = 3;
        public static final int LOWPAN_FIELD_NUMBER = 4;
        private static volatile Parser<NetworkCapabilityTransports> PARSER = null;
        public static final int SATELLITE_FIELD_NUMBER = 5;
        public static final int THREAD_FIELD_NUMBER = 6;
        public static final int USB_FIELD_NUMBER = 7;
        public static final int VPN_FIELD_NUMBER = 8;
        public static final int WIFI_AWARE_FIELD_NUMBER = 10;
        public static final int WIFI_FIELD_NUMBER = 9;
        private int bitField0_;
        private boolean bluetooth_;
        private boolean cellular_;
        private boolean ethernet_;
        private boolean lowpan_;
        private boolean satellite_;
        private boolean thread_;
        private boolean usb_;
        private boolean vpn_;
        private boolean wifiAware_;
        private boolean wifi_;

        /* renamed from: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder */
        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<NetworkCapabilityTransports, Builder> implements NetworkCapabilityTransportsOrBuilder {
            /* synthetic */ Builder(C33273a c33273a) {
                this();
            }

            public Builder clearBluetooth() {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).clearBluetooth();
                return this;
            }

            public Builder clearCellular() {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).clearCellular();
                return this;
            }

            public Builder clearEthernet() {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).clearEthernet();
                return this;
            }

            public Builder clearLowpan() {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).clearLowpan();
                return this;
            }

            public Builder clearSatellite() {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).clearSatellite();
                return this;
            }

            public Builder clearThread() {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).clearThread();
                return this;
            }

            public Builder clearUsb() {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).clearUsb();
                return this;
            }

            public Builder clearVpn() {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).clearVpn();
                return this;
            }

            public Builder clearWifi() {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).clearWifi();
                return this;
            }

            public Builder clearWifiAware() {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).clearWifiAware();
                return this;
            }

            @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getBluetooth() {
                return ((NetworkCapabilityTransports) this.instance).getBluetooth();
            }

            @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getCellular() {
                return ((NetworkCapabilityTransports) this.instance).getCellular();
            }

            @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getEthernet() {
                return ((NetworkCapabilityTransports) this.instance).getEthernet();
            }

            @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getLowpan() {
                return ((NetworkCapabilityTransports) this.instance).getLowpan();
            }

            @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getSatellite() {
                return ((NetworkCapabilityTransports) this.instance).getSatellite();
            }

            @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getThread() {
                return ((NetworkCapabilityTransports) this.instance).getThread();
            }

            @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getUsb() {
                return ((NetworkCapabilityTransports) this.instance).getUsb();
            }

            @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getVpn() {
                return ((NetworkCapabilityTransports) this.instance).getVpn();
            }

            @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getWifi() {
                return ((NetworkCapabilityTransports) this.instance).getWifi();
            }

            @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean getWifiAware() {
                return ((NetworkCapabilityTransports) this.instance).getWifiAware();
            }

            @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasBluetooth() {
                return ((NetworkCapabilityTransports) this.instance).hasBluetooth();
            }

            @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasCellular() {
                return ((NetworkCapabilityTransports) this.instance).hasCellular();
            }

            @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasEthernet() {
                return ((NetworkCapabilityTransports) this.instance).hasEthernet();
            }

            @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasLowpan() {
                return ((NetworkCapabilityTransports) this.instance).hasLowpan();
            }

            @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasSatellite() {
                return ((NetworkCapabilityTransports) this.instance).hasSatellite();
            }

            @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasThread() {
                return ((NetworkCapabilityTransports) this.instance).hasThread();
            }

            @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasUsb() {
                return ((NetworkCapabilityTransports) this.instance).hasUsb();
            }

            @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasVpn() {
                return ((NetworkCapabilityTransports) this.instance).hasVpn();
            }

            @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasWifi() {
                return ((NetworkCapabilityTransports) this.instance).hasWifi();
            }

            @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
            public boolean hasWifiAware() {
                return ((NetworkCapabilityTransports) this.instance).hasWifiAware();
            }

            public Builder setBluetooth(boolean z) {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).setBluetooth(z);
                return this;
            }

            public Builder setCellular(boolean z) {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).setCellular(z);
                return this;
            }

            public Builder setEthernet(boolean z) {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).setEthernet(z);
                return this;
            }

            public Builder setLowpan(boolean z) {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).setLowpan(z);
                return this;
            }

            public Builder setSatellite(boolean z) {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).setSatellite(z);
                return this;
            }

            public Builder setThread(boolean z) {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).setThread(z);
                return this;
            }

            public Builder setUsb(boolean z) {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).setUsb(z);
                return this;
            }

            public Builder setVpn(boolean z) {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).setVpn(z);
                return this;
            }

            public Builder setWifi(boolean z) {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).setWifi(z);
                return this;
            }

            public Builder setWifiAware(boolean z) {
                copyOnWrite();
                ((NetworkCapabilityTransports) this.instance).setWifiAware(z);
                return this;
            }

            private Builder() {
                super(NetworkCapabilityTransports.DEFAULT_INSTANCE);
            }
        }

        static {
            NetworkCapabilityTransports networkCapabilityTransports = new NetworkCapabilityTransports();
            DEFAULT_INSTANCE = networkCapabilityTransports;
            GeneratedMessageLite.registerDefaultInstance(NetworkCapabilityTransports.class, networkCapabilityTransports);
        }

        private NetworkCapabilityTransports() {
        }

        public void clearBluetooth() {
            this.bitField0_ &= -2;
            this.bluetooth_ = false;
        }

        public void clearCellular() {
            this.bitField0_ &= -3;
            this.cellular_ = false;
        }

        public void clearEthernet() {
            this.bitField0_ &= -5;
            this.ethernet_ = false;
        }

        public void clearLowpan() {
            this.bitField0_ &= -9;
            this.lowpan_ = false;
        }

        public void clearSatellite() {
            this.bitField0_ &= -17;
            this.satellite_ = false;
        }

        public void clearThread() {
            this.bitField0_ &= -33;
            this.thread_ = false;
        }

        public void clearUsb() {
            this.bitField0_ &= -65;
            this.usb_ = false;
        }

        public void clearVpn() {
            this.bitField0_ &= -129;
            this.vpn_ = false;
        }

        public void clearWifi() {
            this.bitField0_ &= -257;
            this.wifi_ = false;
        }

        public void clearWifiAware() {
            this.bitField0_ &= -513;
            this.wifiAware_ = false;
        }

        public static NetworkCapabilityTransports getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NetworkCapabilityTransports parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetworkCapabilityTransports parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NetworkCapabilityTransports> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void setBluetooth(boolean z) {
            this.bitField0_ |= 1;
            this.bluetooth_ = z;
        }

        public void setCellular(boolean z) {
            this.bitField0_ |= 2;
            this.cellular_ = z;
        }

        public void setEthernet(boolean z) {
            this.bitField0_ |= 4;
            this.ethernet_ = z;
        }

        public void setLowpan(boolean z) {
            this.bitField0_ |= 8;
            this.lowpan_ = z;
        }

        public void setSatellite(boolean z) {
            this.bitField0_ |= 16;
            this.satellite_ = z;
        }

        public void setThread(boolean z) {
            this.bitField0_ |= 32;
            this.thread_ = z;
        }

        public void setUsb(boolean z) {
            this.bitField0_ |= 64;
            this.usb_ = z;
        }

        public void setVpn(boolean z) {
            this.bitField0_ |= 128;
            this.vpn_ = z;
        }

        public void setWifi(boolean z) {
            this.bitField0_ |= 256;
            this.wifi_ = z;
        }

        public void setWifiAware(boolean z) {
            this.bitField0_ |= 512;
            this.wifiAware_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C33273a.f90821a[methodToInvoke.ordinal()]) {
                case 1:
                    return new NetworkCapabilityTransports();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t", new Object[]{"bitField0_", "bluetooth_", "cellular_", "ethernet_", "lowpan_", "satellite_", "thread_", "usb_", "vpn_", "wifi_", "wifiAware_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<NetworkCapabilityTransports> parser = PARSER;
                    if (parser == null) {
                        synchronized (NetworkCapabilityTransports.class) {
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

        @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getBluetooth() {
            return this.bluetooth_;
        }

        @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getCellular() {
            return this.cellular_;
        }

        @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getEthernet() {
            return this.ethernet_;
        }

        @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getLowpan() {
            return this.lowpan_;
        }

        @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getSatellite() {
            return this.satellite_;
        }

        @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getThread() {
            return this.thread_;
        }

        @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getUsb() {
            return this.usb_;
        }

        @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getVpn() {
            return this.vpn_;
        }

        @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getWifi() {
            return this.wifi_;
        }

        @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean getWifiAware() {
            return this.wifiAware_;
        }

        @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasBluetooth() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasCellular() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasEthernet() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasLowpan() {
            if ((this.bitField0_ & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasSatellite() {
            if ((this.bitField0_ & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasThread() {
            if ((this.bitField0_ & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasUsb() {
            if ((this.bitField0_ & 64) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasVpn() {
            if ((this.bitField0_ & 128) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasWifi() {
            if ((this.bitField0_ & 256) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.p687v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransportsOrBuilder
        public boolean hasWifiAware() {
            if ((this.bitField0_ & 512) != 0) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(NetworkCapabilityTransports networkCapabilityTransports) {
            return DEFAULT_INSTANCE.createBuilder(networkCapabilityTransports);
        }

        public static NetworkCapabilityTransports parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetworkCapabilityTransports parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NetworkCapabilityTransports parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NetworkCapabilityTransports parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NetworkCapabilityTransports parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NetworkCapabilityTransports parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NetworkCapabilityTransports parseFrom(InputStream inputStream) throws IOException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetworkCapabilityTransports parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetworkCapabilityTransports parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NetworkCapabilityTransports parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NetworkCapabilityTransports) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder */
    /* loaded from: classes9.dex */
    public interface NetworkCapabilityTransportsOrBuilder extends MessageLiteOrBuilder {
        boolean getBluetooth();

        boolean getCellular();

        boolean getEthernet();

        boolean getLowpan();

        boolean getSatellite();

        boolean getThread();

        boolean getUsb();

        boolean getVpn();

        boolean getWifi();

        boolean getWifiAware();

        boolean hasBluetooth();

        boolean hasCellular();

        boolean hasEthernet();

        boolean hasLowpan();

        boolean hasSatellite();

        boolean hasThread();

        boolean hasUsb();

        boolean hasVpn();

        boolean hasWifi();

        boolean hasWifiAware();
    }

    /* renamed from: gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$a */
    /* loaded from: classes9.dex */
    static /* synthetic */ class C33273a {

        /* renamed from: a */
        static final /* synthetic */ int[] f90821a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f90821a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90821a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90821a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90821a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90821a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90821a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f90821a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private NetworkCapabilityTransportsOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
