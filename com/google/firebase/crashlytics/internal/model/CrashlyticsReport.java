package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application_Organization;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Device;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Device;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Log;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_User;
import com.google.firebase.crashlytics.internal.model.C17308xb26d2aa8;
import com.google.firebase.crashlytics.internal.model.C17320xfe724d07;
import com.google.firebase.crashlytics.internal.model.C17322xc2f5febc;
import com.google.firebase.crashlytics.internal.model.C17324x7c929f5b;
import com.google.firebase.crashlytics.internal.model.C17326x7e3e3ebd;
import com.google.firebase.crashlytics.internal.model.C17328xce3d994b;
import com.google.firebase.crashlytics.internal.model.C17330x94fa915f;
import com.google.firebase.crashlytics.internal.model.C17335x87204092;
import com.google.firebase.encoders.annotations.Encodable;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;
import java.util.List;

@AutoValue
@Encodable
/* loaded from: classes4.dex */
public abstract class CrashlyticsReport {

    /* renamed from: a */
    private static final Charset f42900a = Charset.forName("UTF-8");

    @AutoValue
    /* loaded from: classes4.dex */
    public static abstract class ApplicationExitInfo {

        @AutoValue
        /* loaded from: classes4.dex */
        public static abstract class BuildIdMappingForArch {

            @AutoValue.Builder
            /* loaded from: classes4.dex */
            public static abstract class Builder {
                @NonNull
                public abstract BuildIdMappingForArch build();

                @NonNull
                public abstract Builder setArch(@NonNull String str);

                @NonNull
                public abstract Builder setBuildId(@NonNull String str);

                @NonNull
                public abstract Builder setLibraryName(@NonNull String str);
            }

            @NonNull
            public static Builder builder() {
                return new C17308xb26d2aa8.Builder();
            }

            @NonNull
            public abstract String getArch();

            @NonNull
            public abstract String getBuildId();

            @NonNull
            public abstract String getLibraryName();
        }

        @AutoValue.Builder
        /* loaded from: classes4.dex */
        public static abstract class Builder {
            @NonNull
            public abstract ApplicationExitInfo build();

            @NonNull
            public abstract Builder setBuildIdMappingForArch(@Nullable List<BuildIdMappingForArch> list);

            @NonNull
            public abstract Builder setImportance(@NonNull int i);

            @NonNull
            public abstract Builder setPid(@NonNull int i);

            @NonNull
            public abstract Builder setProcessName(@NonNull String str);

            @NonNull
            public abstract Builder setPss(@NonNull long j);

            @NonNull
            public abstract Builder setReasonCode(@NonNull int i);

            @NonNull
            public abstract Builder setRss(@NonNull long j);

            @NonNull
            public abstract Builder setTimestamp(@NonNull long j);

            @NonNull
            public abstract Builder setTraceFile(@Nullable String str);
        }

        @NonNull
        public static Builder builder() {
            return new AutoValue_CrashlyticsReport_ApplicationExitInfo.Builder();
        }

        @Nullable
        public abstract List<BuildIdMappingForArch> getBuildIdMappingForArch();

        @NonNull
        public abstract int getImportance();

        @NonNull
        public abstract int getPid();

        @NonNull
        public abstract String getProcessName();

        @NonNull
        public abstract long getPss();

        @NonNull
        public abstract int getReasonCode();

        @NonNull
        public abstract long getRss();

        @NonNull
        public abstract long getTimestamp();

        @Nullable
        public abstract String getTraceFile();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Architecture {
        public static final int ARM64 = 9;
        public static final int ARMV6 = 5;
        public static final int ARMV7 = 6;
        public static final int UNKNOWN = 7;
        public static final int X86_32 = 0;
        public static final int X86_64 = 1;
    }

    @AutoValue.Builder
    /* loaded from: classes4.dex */
    public static abstract class Builder {
        @NonNull
        public abstract CrashlyticsReport build();

        @NonNull
        public abstract Builder setAppExitInfo(ApplicationExitInfo applicationExitInfo);

        @NonNull
        public abstract Builder setAppQualitySessionId(@Nullable String str);

        @NonNull
        public abstract Builder setBuildVersion(@NonNull String str);

        @NonNull
        public abstract Builder setDisplayVersion(@NonNull String str);

        @NonNull
        public abstract Builder setFirebaseAuthenticationToken(@Nullable String str);

        @NonNull
        public abstract Builder setFirebaseInstallationId(@Nullable String str);

        @NonNull
        public abstract Builder setGmpAppId(@NonNull String str);

        @NonNull
        public abstract Builder setInstallationUuid(@NonNull String str);

        @NonNull
        public abstract Builder setNdkPayload(FilesPayload filesPayload);

        @NonNull
        public abstract Builder setPlatform(int i);

        @NonNull
        public abstract Builder setSdkVersion(@NonNull String str);

        @NonNull
        public abstract Builder setSession(@NonNull Session session);
    }

    @AutoValue
    /* loaded from: classes4.dex */
    public static abstract class CustomAttribute {

        @AutoValue.Builder
        /* loaded from: classes4.dex */
        public static abstract class Builder {
            @NonNull
            public abstract CustomAttribute build();

            @NonNull
            public abstract Builder setKey(@NonNull String str);

            @NonNull
            public abstract Builder setValue(@NonNull String str);
        }

        @NonNull
        public static Builder builder() {
            return new AutoValue_CrashlyticsReport_CustomAttribute.Builder();
        }

        @NonNull
        public abstract String getKey();

        @NonNull
        public abstract String getValue();
    }

    @AutoValue
    /* loaded from: classes4.dex */
    public static abstract class FilesPayload {

        @AutoValue.Builder
        /* loaded from: classes4.dex */
        public static abstract class Builder {
            public abstract FilesPayload build();

            public abstract Builder setFiles(List<File> list);

            public abstract Builder setOrgId(String str);
        }

        @AutoValue
        /* loaded from: classes4.dex */
        public static abstract class File {

            @AutoValue.Builder
            /* loaded from: classes4.dex */
            public static abstract class Builder {
                public abstract File build();

                public abstract Builder setContents(byte[] bArr);

                public abstract Builder setFilename(String str);
            }

            @NonNull
            public static Builder builder() {
                return new AutoValue_CrashlyticsReport_FilesPayload_File.Builder();
            }

            @NonNull
            public abstract byte[] getContents();

            @NonNull
            public abstract String getFilename();
        }

        @NonNull
        public static Builder builder() {
            return new AutoValue_CrashlyticsReport_FilesPayload.Builder();
        }

        /* renamed from: a */
        abstract Builder mo66996a();

        @NonNull
        public abstract List<File> getFiles();

        @Nullable
        public abstract String getOrgId();
    }

    @AutoValue
    /* loaded from: classes4.dex */
    public static abstract class Session {

        @AutoValue
        /* loaded from: classes4.dex */
        public static abstract class Application {

            @AutoValue.Builder
            /* loaded from: classes4.dex */
            public static abstract class Builder {
                @NonNull
                public abstract Application build();

                @NonNull
                public abstract Builder setDevelopmentPlatform(@Nullable String str);

                @NonNull
                public abstract Builder setDevelopmentPlatformVersion(@Nullable String str);

                @NonNull
                public abstract Builder setDisplayVersion(@NonNull String str);

                @NonNull
                public abstract Builder setIdentifier(@NonNull String str);

                @NonNull
                public abstract Builder setInstallationUuid(@NonNull String str);

                @NonNull
                public abstract Builder setOrganization(@NonNull Organization organization);

                @NonNull
                public abstract Builder setVersion(@NonNull String str);
            }

            @AutoValue
            /* loaded from: classes4.dex */
            public static abstract class Organization {

                @AutoValue.Builder
                /* loaded from: classes4.dex */
                public static abstract class Builder {
                    @NonNull
                    public abstract Organization build();

                    @NonNull
                    public abstract Builder setClsId(@NonNull String str);
                }

                @NonNull
                public static Builder builder() {
                    return new AutoValue_CrashlyticsReport_Session_Application_Organization.Builder();
                }

                @NonNull
                /* renamed from: a */
                protected abstract Builder mo66989a();

                @NonNull
                public abstract String getClsId();
            }

            @NonNull
            public static Builder builder() {
                return new AutoValue_CrashlyticsReport_Session_Application.Builder();
            }

            @NonNull
            /* renamed from: a */
            protected abstract Builder mo66991a();

            @NonNull
            /* renamed from: b */
            Application m66990b(@NonNull String str) {
                Organization.Builder builder;
                Organization organization = getOrganization();
                if (organization != null) {
                    builder = organization.mo66989a();
                } else {
                    builder = Organization.builder();
                }
                return mo66991a().setOrganization(builder.setClsId(str).build()).build();
            }

            @Nullable
            public abstract String getDevelopmentPlatform();

            @Nullable
            public abstract String getDevelopmentPlatformVersion();

            @Nullable
            public abstract String getDisplayVersion();

            @NonNull
            public abstract String getIdentifier();

            @Nullable
            public abstract String getInstallationUuid();

            @Nullable
            public abstract Organization getOrganization();

            @NonNull
            public abstract String getVersion();
        }

        @AutoValue.Builder
        /* loaded from: classes4.dex */
        public static abstract class Builder {
            @NonNull
            public abstract Session build();

            @NonNull
            public abstract Builder setApp(@NonNull Application application);

            @NonNull
            public abstract Builder setAppQualitySessionId(@Nullable String str);

            @NonNull
            public abstract Builder setCrashed(boolean z);

            @NonNull
            public abstract Builder setDevice(@NonNull Device device);

            @NonNull
            public abstract Builder setEndedAt(@NonNull Long l);

            @NonNull
            public abstract Builder setEvents(@NonNull List<Event> list);

            @NonNull
            public abstract Builder setGenerator(@NonNull String str);

            @NonNull
            public abstract Builder setGeneratorType(int i);

            @NonNull
            public abstract Builder setIdentifier(@NonNull String str);

            @NonNull
            public Builder setIdentifierFromUtf8Bytes(@NonNull byte[] bArr) {
                return setIdentifier(new String(bArr, CrashlyticsReport.f42900a));
            }

            @NonNull
            public abstract Builder setOs(@NonNull OperatingSystem operatingSystem);

            @NonNull
            public abstract Builder setStartedAt(long j);

            @NonNull
            public abstract Builder setUser(@NonNull User user);
        }

        @AutoValue
        /* loaded from: classes4.dex */
        public static abstract class Device {

            @AutoValue.Builder
            /* loaded from: classes4.dex */
            public static abstract class Builder {
                @NonNull
                public abstract Device build();

                @NonNull
                public abstract Builder setArch(int i);

                @NonNull
                public abstract Builder setCores(int i);

                @NonNull
                public abstract Builder setDiskSpace(long j);

                @NonNull
                public abstract Builder setManufacturer(@NonNull String str);

                @NonNull
                public abstract Builder setModel(@NonNull String str);

                @NonNull
                public abstract Builder setModelClass(@NonNull String str);

                @NonNull
                public abstract Builder setRam(long j);

                @NonNull
                public abstract Builder setSimulator(boolean z);

                @NonNull
                public abstract Builder setState(int i);
            }

            @NonNull
            public static Builder builder() {
                return new AutoValue_CrashlyticsReport_Session_Device.Builder();
            }

            @NonNull
            public abstract int getArch();

            public abstract int getCores();

            public abstract long getDiskSpace();

            @NonNull
            public abstract String getManufacturer();

            @NonNull
            public abstract String getModel();

            @NonNull
            public abstract String getModelClass();

            public abstract long getRam();

            public abstract int getState();

            public abstract boolean isSimulator();
        }

        @AutoValue
        /* loaded from: classes4.dex */
        public static abstract class Event {

            @AutoValue
            /* loaded from: classes4.dex */
            public static abstract class Application {

                @AutoValue.Builder
                /* loaded from: classes4.dex */
                public static abstract class Builder {
                    @NonNull
                    public abstract Application build();

                    @NonNull
                    public abstract Builder setAppProcessDetails(@Nullable List<ProcessDetails> list);

                    @NonNull
                    public abstract Builder setBackground(@Nullable Boolean bool);

                    @NonNull
                    public abstract Builder setCurrentProcessDetails(@Nullable ProcessDetails processDetails);

                    @NonNull
                    public abstract Builder setCustomAttributes(@NonNull List<CustomAttribute> list);

                    @NonNull
                    public abstract Builder setExecution(@NonNull Execution execution);

                    @NonNull
                    public abstract Builder setInternalKeys(@NonNull List<CustomAttribute> list);

                    @NonNull
                    public abstract Builder setUiOrientation(int i);
                }

                @AutoValue
                /* loaded from: classes4.dex */
                public static abstract class Execution {

                    @AutoValue
                    /* loaded from: classes4.dex */
                    public static abstract class BinaryImage {

                        @AutoValue.Builder
                        /* loaded from: classes4.dex */
                        public static abstract class Builder {
                            @NonNull
                            public abstract BinaryImage build();

                            @NonNull
                            public abstract Builder setBaseAddress(long j);

                            @NonNull
                            public abstract Builder setName(@NonNull String str);

                            @NonNull
                            public abstract Builder setSize(long j);

                            @NonNull
                            public abstract Builder setUuid(@Nullable String str);

                            @NonNull
                            public Builder setUuidFromUtf8Bytes(@NonNull byte[] bArr) {
                                return setUuid(new String(bArr, CrashlyticsReport.f42900a));
                            }
                        }

                        @NonNull
                        public static Builder builder() {
                            return new C17320xfe724d07.Builder();
                        }

                        @NonNull
                        public abstract long getBaseAddress();

                        @NonNull
                        public abstract String getName();

                        public abstract long getSize();

                        @Nullable
                        @Encodable.Ignore
                        public abstract String getUuid();

                        @Nullable
                        @Encodable.Field(name = CommonUrlParts.UUID)
                        public byte[] getUuidUtf8Bytes() {
                            String uuid = getUuid();
                            if (uuid != null) {
                                return uuid.getBytes(CrashlyticsReport.f42900a);
                            }
                            return null;
                        }
                    }

                    @AutoValue.Builder
                    /* loaded from: classes4.dex */
                    public static abstract class Builder {
                        @NonNull
                        public abstract Execution build();

                        @NonNull
                        public abstract Builder setAppExitInfo(@NonNull ApplicationExitInfo applicationExitInfo);

                        @NonNull
                        public abstract Builder setBinaries(@NonNull List<BinaryImage> list);

                        @NonNull
                        public abstract Builder setException(@NonNull Exception exception);

                        @NonNull
                        public abstract Builder setSignal(@NonNull Signal signal);

                        @NonNull
                        public abstract Builder setThreads(@NonNull List<Thread> list);
                    }

                    @AutoValue
                    /* loaded from: classes4.dex */
                    public static abstract class Exception {

                        @AutoValue.Builder
                        /* loaded from: classes4.dex */
                        public static abstract class Builder {
                            @NonNull
                            public abstract Exception build();

                            @NonNull
                            public abstract Builder setCausedBy(@NonNull Exception exception);

                            @NonNull
                            public abstract Builder setFrames(@NonNull List<Thread.Frame> list);

                            @NonNull
                            public abstract Builder setOverflowCount(int i);

                            @NonNull
                            public abstract Builder setReason(@NonNull String str);

                            @NonNull
                            public abstract Builder setType(@NonNull String str);
                        }

                        @NonNull
                        public static Builder builder() {
                            return new C17322xc2f5febc.Builder();
                        }

                        @Nullable
                        public abstract Exception getCausedBy();

                        @NonNull
                        public abstract List<Thread.Frame> getFrames();

                        public abstract int getOverflowCount();

                        @Nullable
                        public abstract String getReason();

                        @NonNull
                        public abstract String getType();
                    }

                    @AutoValue
                    /* loaded from: classes4.dex */
                    public static abstract class Signal {

                        @AutoValue.Builder
                        /* loaded from: classes4.dex */
                        public static abstract class Builder {
                            @NonNull
                            public abstract Signal build();

                            @NonNull
                            public abstract Builder setAddress(long j);

                            @NonNull
                            public abstract Builder setCode(@NonNull String str);

                            @NonNull
                            public abstract Builder setName(@NonNull String str);
                        }

                        @NonNull
                        public static Builder builder() {
                            return new C17324x7c929f5b.Builder();
                        }

                        @NonNull
                        public abstract long getAddress();

                        @NonNull
                        public abstract String getCode();

                        @NonNull
                        public abstract String getName();
                    }

                    @AutoValue
                    /* loaded from: classes4.dex */
                    public static abstract class Thread {

                        @AutoValue.Builder
                        /* loaded from: classes4.dex */
                        public static abstract class Builder {
                            @NonNull
                            public abstract Thread build();

                            @NonNull
                            public abstract Builder setFrames(@NonNull List<Frame> list);

                            @NonNull
                            public abstract Builder setImportance(int i);

                            @NonNull
                            public abstract Builder setName(@NonNull String str);
                        }

                        @AutoValue
                        /* loaded from: classes4.dex */
                        public static abstract class Frame {

                            @AutoValue.Builder
                            /* loaded from: classes4.dex */
                            public static abstract class Builder {
                                @NonNull
                                public abstract Frame build();

                                @NonNull
                                public abstract Builder setFile(@NonNull String str);

                                @NonNull
                                public abstract Builder setImportance(int i);

                                @NonNull
                                public abstract Builder setOffset(long j);

                                @NonNull
                                public abstract Builder setPc(long j);

                                @NonNull
                                public abstract Builder setSymbol(@NonNull String str);
                            }

                            @NonNull
                            public static Builder builder() {
                                return new C17328xce3d994b.Builder();
                            }

                            @Nullable
                            public abstract String getFile();

                            public abstract int getImportance();

                            public abstract long getOffset();

                            public abstract long getPc();

                            @NonNull
                            public abstract String getSymbol();
                        }

                        @NonNull
                        public static Builder builder() {
                            return new C17326x7e3e3ebd.Builder();
                        }

                        @NonNull
                        public abstract List<Frame> getFrames();

                        public abstract int getImportance();

                        @NonNull
                        public abstract String getName();
                    }

                    @NonNull
                    public static Builder builder() {
                        return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder();
                    }

                    @Nullable
                    public abstract ApplicationExitInfo getAppExitInfo();

                    @NonNull
                    public abstract List<BinaryImage> getBinaries();

                    @Nullable
                    public abstract Exception getException();

                    @NonNull
                    public abstract Signal getSignal();

                    @Nullable
                    public abstract List<Thread> getThreads();
                }

                @AutoValue
                /* loaded from: classes4.dex */
                public static abstract class ProcessDetails {

                    @AutoValue.Builder
                    /* loaded from: classes4.dex */
                    public static abstract class Builder {
                        @NonNull
                        public abstract ProcessDetails build();

                        @NonNull
                        public abstract Builder setDefaultProcess(boolean z);

                        @NonNull
                        public abstract Builder setImportance(int i);

                        @NonNull
                        public abstract Builder setPid(int i);

                        @NonNull
                        public abstract Builder setProcessName(@NonNull String str);
                    }

                    @NonNull
                    public static Builder builder() {
                        return new C17330x94fa915f.Builder();
                    }

                    public abstract int getImportance();

                    public abstract int getPid();

                    @NonNull
                    public abstract String getProcessName();

                    public abstract boolean isDefaultProcess();
                }

                @NonNull
                public static Builder builder() {
                    return new AutoValue_CrashlyticsReport_Session_Event_Application.Builder();
                }

                @Nullable
                public abstract List<ProcessDetails> getAppProcessDetails();

                @Nullable
                public abstract Boolean getBackground();

                @Nullable
                public abstract ProcessDetails getCurrentProcessDetails();

                @Nullable
                public abstract List<CustomAttribute> getCustomAttributes();

                @NonNull
                public abstract Execution getExecution();

                @Nullable
                public abstract List<CustomAttribute> getInternalKeys();

                public abstract int getUiOrientation();

                @NonNull
                public abstract Builder toBuilder();
            }

            @AutoValue.Builder
            /* loaded from: classes4.dex */
            public static abstract class Builder {
                @NonNull
                public abstract Event build();

                @NonNull
                public abstract Builder setApp(@NonNull Application application);

                @NonNull
                public abstract Builder setDevice(@NonNull Device device);

                @NonNull
                public abstract Builder setLog(@NonNull Log log);

                @NonNull
                public abstract Builder setRollouts(@NonNull RolloutsState rolloutsState);

                @NonNull
                public abstract Builder setTimestamp(long j);

                @NonNull
                public abstract Builder setType(@NonNull String str);
            }

            @AutoValue
            /* loaded from: classes4.dex */
            public static abstract class Device {

                @AutoValue.Builder
                /* loaded from: classes4.dex */
                public static abstract class Builder {
                    @NonNull
                    public abstract Device build();

                    @NonNull
                    public abstract Builder setBatteryLevel(Double d);

                    @NonNull
                    public abstract Builder setBatteryVelocity(int i);

                    @NonNull
                    public abstract Builder setDiskUsed(long j);

                    @NonNull
                    public abstract Builder setOrientation(int i);

                    @NonNull
                    public abstract Builder setProximityOn(boolean z);

                    @NonNull
                    public abstract Builder setRamUsed(long j);
                }

                @NonNull
                public static Builder builder() {
                    return new AutoValue_CrashlyticsReport_Session_Event_Device.Builder();
                }

                @Nullable
                public abstract Double getBatteryLevel();

                public abstract int getBatteryVelocity();

                public abstract long getDiskUsed();

                public abstract int getOrientation();

                public abstract long getRamUsed();

                public abstract boolean isProximityOn();
            }

            @AutoValue
            /* loaded from: classes4.dex */
            public static abstract class Log {

                @AutoValue.Builder
                /* loaded from: classes4.dex */
                public static abstract class Builder {
                    @NonNull
                    public abstract Log build();

                    @NonNull
                    public abstract Builder setContent(@NonNull String str);
                }

                @NonNull
                public static Builder builder() {
                    return new AutoValue_CrashlyticsReport_Session_Event_Log.Builder();
                }

                @NonNull
                public abstract String getContent();
            }

            @AutoValue
            /* loaded from: classes4.dex */
            public static abstract class RolloutAssignment {

                @AutoValue.Builder
                /* loaded from: classes4.dex */
                public static abstract class Builder {
                    @NonNull
                    public abstract RolloutAssignment build();

                    @NonNull
                    public abstract Builder setParameterKey(@NonNull String str);

                    @NonNull
                    public abstract Builder setParameterValue(@NonNull String str);

                    @NonNull
                    public abstract Builder setRolloutVariant(@NonNull RolloutVariant rolloutVariant);

                    @NonNull
                    public abstract Builder setTemplateVersion(@NonNull long j);
                }

                @AutoValue
                /* loaded from: classes4.dex */
                public static abstract class RolloutVariant {

                    @AutoValue.Builder
                    /* loaded from: classes4.dex */
                    public static abstract class Builder {
                        @NonNull
                        public abstract RolloutVariant build();

                        @NonNull
                        public abstract Builder setRolloutId(@NonNull String str);

                        @NonNull
                        public abstract Builder setVariantId(@NonNull String str);
                    }

                    public static Builder builder() {
                        return new C17335x87204092.Builder();
                    }

                    @NonNull
                    public abstract String getRolloutId();

                    @NonNull
                    public abstract String getVariantId();
                }

                @NonNull
                public static Builder builder() {
                    return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.Builder();
                }

                @NonNull
                public abstract String getParameterKey();

                @NonNull
                public abstract String getParameterValue();

                @NonNull
                public abstract RolloutVariant getRolloutVariant();

                @NonNull
                public abstract long getTemplateVersion();
            }

            @AutoValue
            /* loaded from: classes4.dex */
            public static abstract class RolloutsState {

                @AutoValue.Builder
                /* loaded from: classes4.dex */
                public static abstract class Builder {
                    @NonNull
                    public abstract RolloutsState build();

                    @NonNull
                    public abstract Builder setRolloutAssignments(@NonNull List<RolloutAssignment> list);
                }

                @NonNull
                public static Builder builder() {
                    return new AutoValue_CrashlyticsReport_Session_Event_RolloutsState.Builder();
                }

                @NonNull
                @Encodable.Field(name = "assignments")
                public abstract List<RolloutAssignment> getRolloutAssignments();
            }

            @NonNull
            public static Builder builder() {
                return new AutoValue_CrashlyticsReport_Session_Event.Builder();
            }

            @NonNull
            public abstract Application getApp();

            @NonNull
            public abstract Device getDevice();

            @Nullable
            public abstract Log getLog();

            @Nullable
            public abstract RolloutsState getRollouts();

            public abstract long getTimestamp();

            @NonNull
            public abstract String getType();

            @NonNull
            public abstract Builder toBuilder();
        }

        @AutoValue
        /* loaded from: classes4.dex */
        public static abstract class OperatingSystem {

            @AutoValue.Builder
            /* loaded from: classes4.dex */
            public static abstract class Builder {
                @NonNull
                public abstract OperatingSystem build();

                @NonNull
                public abstract Builder setBuildVersion(@NonNull String str);

                @NonNull
                public abstract Builder setJailbroken(boolean z);

                @NonNull
                public abstract Builder setPlatform(int i);

                @NonNull
                public abstract Builder setVersion(@NonNull String str);
            }

            @NonNull
            public static Builder builder() {
                return new AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder();
            }

            @NonNull
            public abstract String getBuildVersion();

            public abstract int getPlatform();

            @NonNull
            public abstract String getVersion();

            public abstract boolean isJailbroken();
        }

        @AutoValue
        /* loaded from: classes4.dex */
        public static abstract class User {

            @AutoValue.Builder
            /* loaded from: classes4.dex */
            public static abstract class Builder {
                @NonNull
                public abstract User build();

                @NonNull
                public abstract Builder setIdentifier(@NonNull String str);
            }

            @NonNull
            public static Builder builder() {
                return new AutoValue_CrashlyticsReport_Session_User.Builder();
            }

            @NonNull
            public abstract String getIdentifier();
        }

        @NonNull
        public static Builder builder() {
            return new AutoValue_CrashlyticsReport_Session.Builder().setCrashed(false);
        }

        @NonNull
        /* renamed from: a */
        Session m66995a(@Nullable String str) {
            return toBuilder().setAppQualitySessionId(str).build();
        }

        @NonNull
        /* renamed from: b */
        Session m66994b(@NonNull List<Event> list) {
            return toBuilder().setEvents(list).build();
        }

        @NonNull
        /* renamed from: c */
        Session m66993c(@NonNull String str) {
            return toBuilder().setApp(getApp().m66990b(str)).build();
        }

        @NonNull
        /* renamed from: d */
        Session m66992d(long j, boolean z, @Nullable String str) {
            Builder builder = toBuilder();
            builder.setEndedAt(Long.valueOf(j));
            builder.setCrashed(z);
            if (str != null) {
                builder.setUser(User.builder().setIdentifier(str).build());
            }
            return builder.build();
        }

        @NonNull
        public abstract Application getApp();

        @Nullable
        public abstract String getAppQualitySessionId();

        @Nullable
        public abstract Device getDevice();

        @Nullable
        public abstract Long getEndedAt();

        @Nullable
        public abstract List<Event> getEvents();

        @NonNull
        public abstract String getGenerator();

        public abstract int getGeneratorType();

        @NonNull
        @Encodable.Ignore
        public abstract String getIdentifier();

        @NonNull
        @Encodable.Field(name = "identifier")
        public byte[] getIdentifierUtf8Bytes() {
            return getIdentifier().getBytes(CrashlyticsReport.f42900a);
        }

        @Nullable
        public abstract OperatingSystem getOs();

        public abstract long getStartedAt();

        @Nullable
        public abstract User getUser();

        public abstract boolean isCrashed();

        @NonNull
        public abstract Builder toBuilder();
    }

    /* loaded from: classes4.dex */
    public enum Type {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_CrashlyticsReport.Builder();
    }

    @NonNull
    /* renamed from: b */
    protected abstract Builder mo66997b();

    @Nullable
    public abstract ApplicationExitInfo getAppExitInfo();

    @Nullable
    public abstract String getAppQualitySessionId();

    @NonNull
    public abstract String getBuildVersion();

    @NonNull
    public abstract String getDisplayVersion();

    @Nullable
    public abstract String getFirebaseAuthenticationToken();

    @Nullable
    public abstract String getFirebaseInstallationId();

    @NonNull
    public abstract String getGmpAppId();

    @NonNull
    public abstract String getInstallationUuid();

    @Nullable
    public abstract FilesPayload getNdkPayload();

    public abstract int getPlatform();

    @NonNull
    public abstract String getSdkVersion();

    @Nullable
    public abstract Session getSession();

    @Encodable.Ignore
    public Type getType() {
        if (getSession() != null) {
            return Type.JAVA;
        }
        if (getNdkPayload() != null) {
            return Type.NATIVE;
        }
        return Type.INCOMPLETE;
    }

    @NonNull
    public CrashlyticsReport withAppQualitySessionId(@Nullable String str) {
        Builder appQualitySessionId = mo66997b().setAppQualitySessionId(str);
        if (getSession() != null) {
            appQualitySessionId.setSession(getSession().m66995a(str));
        }
        return appQualitySessionId.build();
    }

    @NonNull
    public CrashlyticsReport withApplicationExitInfo(ApplicationExitInfo applicationExitInfo) {
        if (applicationExitInfo == null) {
            return this;
        }
        return mo66997b().setAppExitInfo(applicationExitInfo).build();
    }

    @NonNull
    public CrashlyticsReport withEvents(@NonNull List<Session.Event> list) {
        if (getSession() != null) {
            return mo66997b().setSession(getSession().m66994b(list)).build();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    @NonNull
    public CrashlyticsReport withFirebaseAuthenticationToken(@Nullable String str) {
        return mo66997b().setFirebaseAuthenticationToken(str).build();
    }

    @NonNull
    public CrashlyticsReport withFirebaseInstallationId(@Nullable String str) {
        return mo66997b().setFirebaseInstallationId(str).build();
    }

    @NonNull
    public CrashlyticsReport withNdkPayload(@NonNull FilesPayload filesPayload) {
        return mo66997b().setSession(null).setNdkPayload(filesPayload).build();
    }

    @NonNull
    public CrashlyticsReport withOrganizationId(@NonNull String str) {
        Builder mo66997b = mo66997b();
        FilesPayload ndkPayload = getNdkPayload();
        if (ndkPayload != null) {
            mo66997b.setNdkPayload(ndkPayload.mo66996a().setOrgId(str).build());
        }
        Session session = getSession();
        if (session != null) {
            mo66997b.setSession(session.m66993c(str));
        }
        return mo66997b.build();
    }

    @NonNull
    public CrashlyticsReport withSessionEndFields(long j, boolean z, @Nullable String str) {
        Builder mo66997b = mo66997b();
        if (getSession() != null) {
            mo66997b.setSession(getSession().m66992d(j, z, str));
        }
        return mo66997b.build();
    }
}
