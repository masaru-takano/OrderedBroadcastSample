package example.com.orderedbroadcastsample;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;


public class MainActivity extends ActionBarActivity {

    private static final String ACTION_HELLO = "com.example.android.intent.action.HELLO";

    private final BroadcastReceiver clientSideReceiver = new ClientBroadcastReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Intent intent = new Intent(ACTION_HELLO);
        sendOrderedBroadcast(intent, null, clientSideReceiver, new Handler(), RESULT_OK, null, null);
    }

}
