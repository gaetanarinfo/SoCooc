package org.bien.manger.app;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class JavaScriptInterFace {
    Context mContext;

    JavaScriptInterFace(Context c) {
        mContext = c;
    }

    public int changeImage(){
        Log.e("Got", "it"+2);
        return 2;
    }

    public void showToast(){
        Toast.makeText(mContext, "hi", Toast.LENGTH_SHORT).show();
    }

}