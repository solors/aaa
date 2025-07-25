package com.learnings.luid;

/* loaded from: classes6.dex */
class LUIDResponseEntity {
    Data data;
    private Status status;

    /* loaded from: classes6.dex */
    static class Data {
        String luid;

        Data() {
        }
    }

    /* loaded from: classes6.dex */
    static class Status {
        private int code;
        private String message;

        Status() {
        }
    }

    LUIDResponseEntity() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isOk() {
        Status status = this.status;
        if (status != null && status.code == 0) {
            return true;
        }
        return false;
    }
}
