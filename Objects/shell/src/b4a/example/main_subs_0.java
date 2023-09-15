package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,25);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(67108864);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="T.Initialize(\"Hold\",1)";
Debug.ShouldStop(268435456);
main._t.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("Hold")),(Object)(BA.numberCast(long.class, 1)));
 BA.debugLineNum = 31;BA.debugLine="T.Enabled=False";
Debug.ShouldStop(1073741824);
main._t.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,39);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,35);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Dim Test As Int=0";
main._test = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 21;BA.debugLine="Private Label1 As Label";
main.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hold_tick() throws Exception{
try {
		Debug.PushSubsStack("Hold_Tick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,60);
if (RapidSub.canDelegate("hold_tick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","hold_tick");}
 BA.debugLineNum = 60;BA.debugLine="Sub Hold_Tick";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 62;BA.debugLine="Test=Test+1";
Debug.ShouldStop(536870912);
main._test = RemoteObject.solve(new RemoteObject[] {main._test,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 63;BA.debugLine="Label1.Text=Test";
Debug.ShouldStop(1073741824);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(main._test));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel1_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("Panel1_Touch (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,44);
if (RapidSub.canDelegate("panel1_touch")) { return b4a.example.main.remoteMe.runUserSub(false, "main","panel1_touch", _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 44;BA.debugLine="Private Sub Panel1_Touch (Action As Int, X As Floa";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="If Action=Activity.ACTION_DOWN And T.Enabled=Fals";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, main.mostCurrent._activity.getField(true,"ACTION_DOWN"))) && RemoteObject.solveBoolean("=",main._t.runMethod(true,"getEnabled"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 48;BA.debugLine="T.Enabled=True";
Debug.ShouldStop(32768);
main._t.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 }else 
{ BA.debugLineNum = 50;BA.debugLine="else if  Action=Activity.ACTION_UP Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, main.mostCurrent._activity.getField(true,"ACTION_UP")))) { 
 BA.debugLineNum = 52;BA.debugLine="T.Enabled=False";
Debug.ShouldStop(524288);
main._t.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 54;BA.debugLine="Release";
Debug.ShouldStop(2097152);
_release();
 }}
;
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 13;BA.debugLine="Dim T As Timer";
main._t = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _release() throws Exception{
try {
		Debug.PushSubsStack("Release (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,67);
if (RapidSub.canDelegate("release")) { return b4a.example.main.remoteMe.runUserSub(false, "main","release");}
 BA.debugLineNum = 67;BA.debugLine="Sub Release";
Debug.ShouldStop(4);
 BA.debugLineNum = 69;BA.debugLine="Test=0";
Debug.ShouldStop(16);
main._test = BA.numberCast(int.class, 0);
 BA.debugLineNum = 70;BA.debugLine="Label1.Text=Test";
Debug.ShouldStop(32);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(main._test));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}