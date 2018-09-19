package com.example.marci.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    Scene mASscene;
    Scene mAnotherScene;
    ViewGroup mSceneRoot;
    Transition transitionMgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSceneRoot = (ViewGroup)findViewById(R.id.root_layout);
        mASscene = Scene.getSceneForLayout(mSceneRoot, R.layout.a_scene, this);
        mAnotherScene = Scene.getSceneForLayout(mSceneRoot, R.layout.another_scene, this);
        transitionMgr = TransitionInflater.from(this).inflateTransition(R.transition.fade_transition);

    }
    public void Boton 1 (View view) { TransitionManager.go(mASscene, transitionMgr); }

}
