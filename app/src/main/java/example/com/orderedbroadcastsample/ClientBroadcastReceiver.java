package example.com.orderedbroadcastsample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Client-side broadcast receiver.
 */
public class ClientBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle result = getResultExtras(false);
        Log.i("AAA", "Received response: " + result.getString("message"));
    }

}
