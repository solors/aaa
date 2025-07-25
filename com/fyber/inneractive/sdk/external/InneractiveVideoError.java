package com.fyber.inneractive.sdk.external;

/* loaded from: classes4.dex */
public class InneractiveVideoError extends InneractiveError {

    /* renamed from: a */
    public final Error f27368a;

    /* renamed from: b */
    public final Throwable f27369b;

    /* loaded from: classes4.dex */
    public enum Error {
        ERROR_NO_MEDIA_FILES("ErrorNoMediaFiles", true),
        ERROR_FAILED_PLAYING_MEDIA_FILE("ErrorPlayingMediaFile", false),
        ERROR_FAILED_PLAYING_ALL_MEDIA_FILES("ErrorPlayingAllMediaFile", true),
        ERROR_PRE_BUFFER_TIMEOUT("ErrorPreBufferTimeout", false),
        ERROR_BUFFER_TIMEOUT("ErrorBufferTimeout", false);
        
        private String errorString;
        private boolean isFatal;

        Error(String str, boolean z) {
            this.errorString = str;
            this.isFatal = z;
        }

        public String getErrorString() {
            return this.errorString;
        }

        public boolean isFatal() {
            return this.isFatal;
        }
    }

    public InneractiveVideoError(Error error) {
        this.f27368a = error;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        if (this.f27369b != null) {
            return this.f27368a.getErrorString() + ": " + this.f27369b;
        }
        return this.f27368a.getErrorString();
    }

    public Throwable getCause() {
        return this.f27369b;
    }

    public Error getPlayerError() {
        return this.f27368a;
    }

    public InneractiveVideoError(Error error, Throwable th) {
        this(error);
        this.f27369b = th;
    }
}
