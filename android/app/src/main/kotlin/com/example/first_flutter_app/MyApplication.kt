import io.flutter.app.FlutterApplication
import com.clevertap.android.sdk.ActivityLifecycleCallback


class MyApplication : FlutterApplication() {
    override fun onCreate() {
        ActivityLifecycleCallback.register(this)//<--- Add this before super.onCreate()
        super.onCreate()
    }
}