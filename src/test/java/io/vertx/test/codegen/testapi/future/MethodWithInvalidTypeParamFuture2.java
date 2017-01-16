package io.vertx.test.codegen.testapi.future;

import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.concurrent.CompletionStage;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@VertxGen
public interface MethodWithInvalidTypeParamFuture2 {
  <U, T> void m(Handler<AsyncResult<T>> handler);
  <T, U> CompletionStage<T> m();
}