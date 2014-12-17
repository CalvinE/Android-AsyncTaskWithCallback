package com.stronglinksolutions.classes;

import com.stronglinksolutions.interfaces.ICallBack;

import android.os.AsyncTask;

public abstract class AsyncTaskWithCallBack<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> implements ICallBack<Result>{
	
	

}
