package com.xuzc.study.rxjava;


import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class RxJavaHelloWorld {
    public static void main(String[] args) {
        Observable<String> observable = Observable.create(new ObservableOnSubscribe<String>() {
            public void subscribe(ObservableEmitter<String> observableEmitter) {
                observableEmitter.onNext("Hello World");
            }
        });

        //创建观察者
        Observer<String> observer = new Observer<String>() {
            public void onSubscribe(Disposable disposable) {
            }
            public void onNext(String s) {
                System.out.println(s);
            }
            public void onError(Throwable throwable) {

            }
            public void onComplete() {

            }
        };

        observable.subscribe(observer);
    }
}
