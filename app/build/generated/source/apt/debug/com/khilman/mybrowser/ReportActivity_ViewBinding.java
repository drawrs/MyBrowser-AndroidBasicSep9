// Generated code from Butter Knife. Do not modify!
package com.khilman.mybrowser;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ReportActivity_ViewBinding implements Unbinder {
  private ReportActivity target;

  private View view2131427426;

  @UiThread
  public ReportActivity_ViewBinding(ReportActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ReportActivity_ViewBinding(final ReportActivity target, View source) {
    this.target = target;

    View view;
    target.edtReport = Utils.findRequiredViewAsType(source, R.id.edtReport, "field 'edtReport'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btnReport, "field 'btnReport' and method 'onViewClicked'");
    target.btnReport = Utils.castView(view, R.id.btnReport, "field 'btnReport'", Button.class);
    view2131427426 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ReportActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.edtReport = null;
    target.btnReport = null;

    view2131427426.setOnClickListener(null);
    view2131427426 = null;
  }
}
