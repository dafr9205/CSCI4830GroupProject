package com.example.devon.aslbuddy;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class QuizActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;

    private ImageView mImageView;

    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;


    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question1);
        mImageView = (ImageView)findViewById(R.id.dquiz);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);

        updateQuestion();


        //Start of button listener for button 1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
             @Override
            public void onClick(View view) {

                 if (mButtonChoice1.getText() == mAnswer) {
                     mScore = mScore + 1;
                     updateScore(mScore);
                     Toast.makeText(QuizActivity.this, "correct!", Toast.LENGTH_SHORT).show();

                     if (mQuestionNumber == QuestionLibrary.mQuestions.length) {
                         Intent i = new Intent(QuizActivity.this, ResultsActivity.class);
                         Bundle bundle = new Bundle();
                         bundle.putInt("finalScore", mScore);
                         i.putExtras(bundle);
                         QuizActivity.this.finish();
                         startActivity(i);
                     } else {
                         updateQuestion();
                     }
                 }
                 //if the user is wrong
                 else{
                     Toast.makeText(QuizActivity.this, "incorrect!", Toast.LENGTH_SHORT).show();
                     if (mQuestionNumber == QuestionLibrary.mQuestions.length) {
                         Intent i = new Intent(QuizActivity.this, ResultsActivity.class);
                         Bundle bundle = new Bundle();
                         bundle.putInt("finalScore", mScore);
                         i.putExtras(bundle);
                         QuizActivity.this.finish();
                         startActivity(i);
                     } else {
                         updateQuestion();
                     }
                 }
             }
        });
        //End of button listener for button 1

        //Start of button listener for button 2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    Toast.makeText(QuizActivity.this, "correct!", Toast.LENGTH_SHORT).show();

                    if (mQuestionNumber == QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(QuizActivity.this, ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
                //if the user is wrong
                else{
                    Toast.makeText(QuizActivity.this, "incorrect!", Toast.LENGTH_SHORT).show();
                    if (mQuestionNumber == QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(QuizActivity.this, ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });
        //End of button listener for button 2

        //Start of button listener for button 3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    Toast.makeText(QuizActivity.this, "correct!", Toast.LENGTH_SHORT).show();

                    if (mQuestionNumber == QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(QuizActivity.this, ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
                //if the user is wrong
                else{
                    Toast.makeText(QuizActivity.this, "incorrect!", Toast.LENGTH_SHORT).show();
                    if (mQuestionNumber == QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(QuizActivity.this, ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });
        //End of button listener for button 3

    }

    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mImageView.setImageResource(QuestionLibrary.images[mQuestionNumber]);
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
        if (mQuestionNumber == QuestionLibrary.mQuestions.length){
            Intent i = new Intent(QuizActivity.this,ResultsActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("finalScore", mScore);
            i.putExtras(bundle);
            QuizActivity.this.finish();
            startActivity(i);
        }
    }

    private void updateScore(int point){
        mScoreView.setText("" + mScore);
    }

}
