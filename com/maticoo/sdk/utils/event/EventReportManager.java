package com.maticoo.sdk.utils.event;

import com.maticoo.sdk.utils.WorkExecutor;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.model.Configurations;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes6.dex */
public class EventReportManager implements EventReportListener {
    private static final int MAX_UPLOAD_TIMES = 3;
    private Configurations configurations;
    private ConcurrentLinkedQueue<EventReportTask> reportTasks;

    /* loaded from: classes6.dex */
    public static class Holder {
        private static final EventReportManager INSTANCE = new EventReportManager();

        private Holder() {
        }
    }

    public static EventReportManager getInstance() {
        return Holder.INSTANCE;
    }

    public /* synthetic */ void lambda$reportEvent$0(Event event) {
        if (event.isInteractEvent()) {
            EventReportTask eventReportTask = new EventReportTask(event, this);
            if (eventReportTask.upload()) {
                this.reportTasks.add(eventReportTask);
            }
        }
        EventReportBITask eventReportBITask = new EventReportBITask(event, this);
        if (eventReportBITask.upload()) {
            this.reportTasks.add(eventReportBITask);
        }
    }

    @Override // com.maticoo.sdk.utils.event.EventReportListener
    public void onReportResult(EventReportTask eventReportTask, boolean z) {
        if (z) {
            this.reportTasks.remove(eventReportTask);
        } else if (eventReportTask.getUploadTimes() >= 3) {
            this.reportTasks.remove(eventReportTask);
        } else if (!eventReportTask.upload()) {
            this.reportTasks.remove(eventReportTask);
        }
    }

    public void reportEvent(int i) {
        reportEvent(new Event(i));
    }

    public void setConfigurations(Configurations configurations) {
        this.configurations = configurations;
    }

    private EventReportManager() {
        this.reportTasks = new ConcurrentLinkedQueue<>();
    }

    public void reportEvent(final Event event) {
        if (event == null) {
            return;
        }
        if (event.justToSdkServer) {
            DeveloperLog.LogD("EventReportManager2", event.toString());
            EventReportTask eventReportTask = new EventReportTask(event, this);
            if (eventReportTask.upload()) {
                this.reportTasks.add(eventReportTask);
                return;
            }
            return;
        }
        DeveloperLog.LogD("EventReportManager", event.toString());
        Configurations configurations = this.configurations;
        int trackLevel = configurations != null ? configurations.getTrackLevel() : 1;
        int eventPriority = event.getEventPriority();
        if (eventPriority > trackLevel) {
            DeveloperLog.LogD("reportEvent, current event priority is " + eventPriority + "   report level is " + trackLevel + "   return");
            return;
        }
        WorkExecutor.execute(new Runnable() { // from class: com.maticoo.sdk.utils.event.a
            {
                EventReportManager.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EventReportManager.this.lambda$reportEvent$0(event);
            }
        });
    }
}
