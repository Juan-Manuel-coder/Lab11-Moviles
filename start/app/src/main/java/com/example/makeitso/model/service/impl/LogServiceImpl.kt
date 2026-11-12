package com.example.makeitso.model.service.impl

import com.example.makeitso.model.service.LogService
import com.google.firebase.crashlytics.FirebaseCrashlytics
import javax.inject.Inject

class LogServiceImpl @Inject constructor() : LogService {
  override fun logNonFatalCrash(throwable: Throwable) {
    FirebaseCrashlytics.getInstance().recordException(throwable)
  }
}