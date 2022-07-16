package jp.debimate.sqllesson.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Activityは、Androidアプリの画面に相当する。画面がないアプリの場合は、Activityがない。
 * MainActivityは、アプリ起動時に呼ばれる。エントリーポイント設定は、AndroidManifest.xmlで指定する。
 * AndroidManifest.xml：パッケージ名、コンポーネント、パーミッション、必須HW/SW設定などが書かれる。
 *
 * Activityクラスは、Activityを継承する必要がある。
 * AppCompatActivityは、新しいAPIレベルで追加された機能を古いAPIレベルで使用可能にするクラスである。
 * （新機能のバックポートをしているクラスである）
 */
class MainActivity : AppCompatActivity() {
    /**
     * Androidアプリ起動時に、最初に実行されるメソッド（エントリーポイント）
     * Activityにはライフサイクルがあり、呼び出すメソッドには対応関係がある。
     * onCreate() <--> onStop()
     * onStart()  <--> onRestart() <--> onStop()
     * onResume() <--> onPause()
     * onDestroy()
     *
     * onCreate()は、Activityが初めて生成された時に呼び、初期化処理を行う。
     * onStart()は、Activityが生成されたが、ユーザーに見えない時に使用する。
     * onResume()は、他のActivityへ遷移してから復帰した時に使用する。
     *
     * Bundleは、Android OS 起因でアプリがキルされた時、状態復元用にデータを保存する。
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*
         * Activityにビューを設定するメソッド
         * レイアウトファイルactivity_main.xmlを読み込む。
         */
        setContentView(R.layout.activity_main)
    }
}