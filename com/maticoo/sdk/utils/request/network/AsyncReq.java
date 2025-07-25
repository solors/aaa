package com.maticoo.sdk.utils.request.network;

import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.request.network.connect.AbstractUrlConnection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class AsyncReq extends BaseTask implements Runnable {
    private OnTaskCallback mCallback;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface OnTaskCallback {
        void onError(String str);

        void onSuccess(Response response);
    }

    public AsyncReq(Request request) {
        super(request);
    }

    @Override // java.lang.Runnable
    public void run() {
        StringBuilder sb2;
        String str = "";
        try {
            AbstractUrlConnection abstractUrlConnection = this.mConnection;
            if (abstractUrlConnection == null) {
                OnTaskCallback onTaskCallback = this.mCallback;
                if (onTaskCallback != null) {
                    onTaskCallback.onError("not http connection");
                }
                AbstractUrlConnection abstractUrlConnection2 = this.mConnection;
                if (abstractUrlConnection2 != null) {
                    try {
                        abstractUrlConnection2.cancel();
                        return;
                    } catch (Throwable th) {
                        Request request = this.mRequest;
                        if (request != null) {
                            str = request.getUrl();
                        }
                        DeveloperLog.LogE("AsyncReq url:" + str, th);
                        return;
                    }
                }
                return;
            }
            Response intercept = abstractUrlConnection.intercept(this.mRequest);
            if (intercept == null) {
                OnTaskCallback onTaskCallback2 = this.mCallback;
                if (onTaskCallback2 != null) {
                    onTaskCallback2.onSuccess(null);
                }
            } else {
                OnTaskCallback onTaskCallback3 = this.mCallback;
                if (onTaskCallback3 != null) {
                    onTaskCallback3.onSuccess(intercept);
                }
            }
            AbstractUrlConnection abstractUrlConnection3 = this.mConnection;
            if (abstractUrlConnection3 != null) {
                try {
                    abstractUrlConnection3.cancel();
                } catch (Throwable th2) {
                    th = th2;
                    Request request2 = this.mRequest;
                    if (request2 != null) {
                        str = request2.getUrl();
                    }
                    sb2 = new StringBuilder();
                    sb2.append("AsyncReq url:");
                    sb2.append(str);
                    DeveloperLog.LogE(sb2.toString(), th);
                }
            }
        } catch (Throwable th3) {
            try {
                OnTaskCallback onTaskCallback4 = this.mCallback;
                if (onTaskCallback4 == null) {
                    AbstractUrlConnection abstractUrlConnection4 = this.mConnection;
                    if (abstractUrlConnection4 != null) {
                        try {
                            abstractUrlConnection4.cancel();
                            return;
                        } catch (Throwable th4) {
                            Request request3 = this.mRequest;
                            if (request3 != null) {
                                str = request3.getUrl();
                            }
                            DeveloperLog.LogE("AsyncReq url:" + str, th4);
                            return;
                        }
                    }
                    return;
                }
                onTaskCallback4.onError(th3.toString());
                AbstractUrlConnection abstractUrlConnection5 = this.mConnection;
                if (abstractUrlConnection5 != null) {
                    try {
                        abstractUrlConnection5.cancel();
                    } catch (Throwable th5) {
                        th = th5;
                        Request request4 = this.mRequest;
                        if (request4 != null) {
                            str = request4.getUrl();
                        }
                        sb2 = new StringBuilder();
                        sb2.append("AsyncReq url:");
                        sb2.append(str);
                        DeveloperLog.LogE(sb2.toString(), th);
                    }
                }
            } catch (Throwable th6) {
                AbstractUrlConnection abstractUrlConnection6 = this.mConnection;
                if (abstractUrlConnection6 != null) {
                    try {
                        abstractUrlConnection6.cancel();
                    } catch (Throwable th7) {
                        Request request5 = this.mRequest;
                        if (request5 != null) {
                            str = request5.getUrl();
                        }
                        DeveloperLog.LogE("AsyncReq url:" + str, th7);
                    }
                }
                throw th6;
            }
        }
    }

    public void setCallback(OnTaskCallback onTaskCallback) {
        this.mCallback = onTaskCallback;
    }
}
