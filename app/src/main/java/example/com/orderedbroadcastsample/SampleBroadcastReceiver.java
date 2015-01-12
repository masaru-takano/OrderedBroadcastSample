package example.com.orderedbroadcastsample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.Date;

public class SampleBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle extras = new Bundle();
        extras.putString("message", "Hello, World!!");
        setResultExtras(extras);
    }

}
