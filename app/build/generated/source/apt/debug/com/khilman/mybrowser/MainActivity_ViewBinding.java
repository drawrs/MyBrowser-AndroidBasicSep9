// Generated code from Butter Knife. Do not modify!
package com.khilman.mybrowser;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131427423;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.txtURL = Utils.findRequiredViewAsType(source, R.id.txtURL, "field 'txtURL'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btnGo, "field 'btnGo' and method 'onViewClicked'");
    target.btnGo = Utils.castView(view, R.id.btnGo, "field 'btnGo'", Button.class);
    view2131427423 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    target.webView = Utils.findRequiredViewAsType(source, R.id.webView, "field 'webView'", WebView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtURL = null;
    target.btnGo = null;
    target.webView = null;

    view2131427423.setOnClickListener(null);
    view2131427423 = null;
  }
}
