package com.fredporciuncula.autosizingpitfalls

import android.widget.TextView
import androidx.core.view.doOnPreDraw

fun TextView.setMaxLinesToEllipsize() = doOnPreDraw {
  val numberOfCompletelyVisibleLines = (measuredHeight - paddingTop - paddingBottom) / lineHeight
  maxLines = numberOfCompletelyVisibleLines
}
