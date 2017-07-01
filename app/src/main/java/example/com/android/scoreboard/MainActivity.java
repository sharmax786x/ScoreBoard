package example.com.android.scoreboard;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int indOnStrike=1;
    int pakOnStrike=1;
    int indWickets=0;
    int pakWickets=0;
    int indScore=0;
    int pakScore=0;
    int indPlayer1Score=0;
    int indPlayer1Temp=1;
    int indPlayer2Temp=1;
    int pakPlayer1Temp=1;
    int pakPlayer2Temp=1;
    int indPlayer2Score=0;
    int indPlayer3Score=0;
    int pakPlayer1Score=0;
    int pakPlayer2Score=0;
    int pakPlayer3Score=0;
    int indBalls=0;
    int pakBalls=0;
    TextView tvIndScore,tvPakScore,tvIndPlayer1,tvIndPlayer2,tvIndPlayer1Runs,tvIndPlayer2Runs,tvIndPlayer3,tvIndPlayer3Runs,tvIndPlayer1Status,tvIndPlayer2Status,tvIndPlayer3Status;
    TextView tvPakPlayer1,tvPakPlayer2,tvPakPlayer3,tvPakPlayer1Status,tvPakPlayer2Status,tvPakPlayer3Status,tvPakPlayer1Runs,tvPakPlayer2Runs,tvPakPlayer3Runs,tvInningsStatus;
    LinearLayout indRuns,pakRuns;


    @Override
    protected void onRestart() {
        Log.i("tag","app restarted");
        super.onRestart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvInningsStatus=(TextView)findViewById(R.id.tvInningsStatus);
        tvInningsStatus=(TextView)findViewById(R.id.tvInningsStatus);
        tvIndScore=(TextView)findViewById(R.id.tvIndScore);
        tvPakScore=(TextView)findViewById(R.id.tvPakScore);
        tvIndPlayer1=(TextView)findViewById(R.id.tvIndPlayer1);
        tvIndPlayer2=(TextView)findViewById(R.id.tvIndPlayer2);
        tvIndPlayer3=(TextView)findViewById(R.id.tvIndPlayer3);
        tvPakPlayer1=(TextView)findViewById(R.id.tvPakPlayer1);
        tvPakPlayer2=(TextView)findViewById(R.id.tvPakPlayer2);
        tvPakPlayer3=(TextView)findViewById(R.id.tvPakPlayer3);
        tvIndPlayer1Status=(TextView)findViewById(R.id.tvIndPlayer1Status);
        tvIndPlayer2Status=(TextView)findViewById(R.id.tvIndPlayer2Status);
        tvIndPlayer3Status=(TextView)findViewById(R.id.tvIndPlayer3Status);
        tvPakPlayer1Status=(TextView)findViewById(R.id.tvPakPlayer1Status);
        tvPakPlayer2Status=(TextView)findViewById(R.id.tvPakPlayer2Status);
        tvPakPlayer3Status=(TextView)findViewById(R.id.tvPakPlayer3Status);
        tvIndPlayer1Runs=(TextView)findViewById(R.id.tvIndPlayer1Runs);
        tvIndPlayer2Runs=(TextView)findViewById(R.id.tvIndPlayer2Runs);
        tvIndPlayer3Runs=(TextView)findViewById(R.id.tvIndPlayer3Runs);
        tvPakPlayer1Runs=(TextView)findViewById(R.id.tvPakPlayer1Runs);
        tvPakPlayer2Runs=(TextView)findViewById(R.id.tvPakPlayer2Runs);
        tvPakPlayer3Runs=(TextView)findViewById(R.id.tvPakPlayer3Runs);
        indRuns=(LinearLayout)findViewById(R.id.indRuns);
        pakRuns=(LinearLayout)findViewById(R.id.pakRuns);
        for (int i = 0; i < pakRuns.getChildCount(); i++)
        {
            View child = pakRuns.getChildAt(i);
            child.setEnabled(false);
        }
    }

    public void zero(View view)
    {
        indBalls++;
        tvInningsStatus.setText("India are at "+indScore+" with "+(6-indBalls)+" balls left");
        indOverComplete();
    }

    public void one(View view)
    {
        indBalls++;
        indScore++;
        tvIndScore.setText(""+indScore+"/"+indWickets);
        tvInningsStatus.setText("India are at "+indScore+" with "+(6-indBalls)+" balls left");
        if(indOnStrike==1)
        {
            indPlayer1Score++;
            tvIndPlayer1Runs.setText(""+indPlayer1Score);
            indOverComplete();
            indStrikeChange1();
            return;
        }
        if(indOnStrike==2)
        {
            indPlayer2Score++;
            tvIndPlayer2Runs.setText(""+indPlayer2Score);
            indOverComplete();
            indStrikeChange2();
            return;
        }
        if(indOnStrike==3)
        {
            indPlayer3Score++;
            tvIndPlayer3Runs.setText(""+indPlayer3Score);
            indOverComplete();
            indStrikeChange3();
            return;
        }
    }

    public void two(View view)
    {
        indBalls++;
        indScore+=2;
        tvIndScore.setText(""+indScore+"/"+indWickets);
        tvInningsStatus.setText("India are at "+indScore+" with "+(6-indBalls)+" balls left");
        if(indOnStrike==1)
        {
            indPlayer1Score+=2;
            tvIndPlayer1Runs.setText(""+indPlayer1Score);
            indOverComplete();
            return;
        }
        if(indOnStrike==2)
        {
            indPlayer2Score+=2;
            tvIndPlayer2Runs.setText(""+indPlayer2Score);
            indOverComplete();
            return;
        }
        if(indOnStrike==3)
        {
            indPlayer3Score+=2;
            tvIndPlayer3Runs.setText(""+indPlayer3Score);
            indOverComplete();
            return;
        }
    }

    public void three(View view)
    {
        indBalls++;
        indScore+=3;
        tvIndScore.setText("" + indScore + "/" + indWickets);
        tvInningsStatus.setText("India are at "+indScore+" with "+(6-indBalls)+" balls left");
        if (indOnStrike == 1)
        {
            indPlayer1Score+=3;
            tvIndPlayer1Runs.setText("" + indPlayer1Score);
            indOverComplete();
            indStrikeChange1();
            return;
        }
        if (indOnStrike == 2)
        {
            indPlayer2Score+=3;
            tvIndPlayer2Runs.setText("" + indPlayer2Score);
            indOverComplete();
            indStrikeChange2();
            return;
        }
        if (indOnStrike == 3)
        {
            indPlayer3Score+=3;
            tvIndPlayer3Runs.setText("" + indPlayer3Score);
            indOverComplete();
            indStrikeChange3();
            return;
        }
    }

    public void four(View view)
    {
        indBalls++;
        indScore+=4;
        tvIndScore.setText(""+indScore+"/"+indWickets);
        tvInningsStatus.setText("India are at "+indScore+" with "+(6-indBalls)+" balls left");
        if(indOnStrike==1)
        {
            indPlayer1Score+=4;
            tvIndPlayer1Runs.setText(""+indPlayer1Score);
            indOverComplete();
            return;
        }
        if(indOnStrike==2)
        {
            indPlayer2Score+=4;
            tvIndPlayer2Runs.setText(""+indPlayer2Score);
            indOverComplete();
            return;
        }
        if(indOnStrike==3)
        {
            indPlayer3Score+=4;
            tvIndPlayer3Runs.setText(""+indPlayer3Score);
            indOverComplete();
            return;
        }
    }

    public void six(View view)
    {
        indBalls++;
        indScore+=6;
        tvIndScore.setText(""+indScore+"/"+indWickets);
        tvInningsStatus.setText("India are at "+indScore+" with "+(6-indBalls)+" balls left");
        if(indOnStrike==1)
        {
            indPlayer1Score+=6;
            tvIndPlayer1Runs.setText(""+indPlayer1Score);
            indOverComplete();
            return;
        }
        if(indOnStrike==2)
        {
            indPlayer2Score+=6;
            tvIndPlayer2Runs.setText(""+indPlayer2Score);
            indOverComplete();
            return;
        }
        if(indOnStrike==3)
        {
            indPlayer3Score+=6;
            tvIndPlayer3Runs.setText(""+indPlayer3Score);
            indOverComplete();
            return;
        }
    }

    public void wicket(View view)
    {
        indBalls++;
        indWickets++;
        tvInningsStatus.setText("India are at "+indScore+" with "+(6-indBalls)+" balls left");
        if(indOnStrike==1)
        {
            tvIndPlayer1Status.setText("out");
            tvIndPlayer1.setTypeface(null,Typeface.NORMAL);
            if(indWickets==2||indBalls==6)
            {
                tvIndScore.setText(""+indScore+"/"+indWickets);
                tvInningsStatus.setText("Pakistan need "+(indScore+1)+" in 6 Balls");
                for (int i = 0, j = 0; i < indRuns.getChildCount()&& j < pakRuns.getChildCount(); i++, j++)
                {
                    View child1 = indRuns.getChildAt(i);
                    child1.setEnabled(false);
                    View child2 = pakRuns.getChildAt(i);
                    child2.setEnabled(true);
                }
                return;
            }
            indOnStrike=3;
            indPlayer1Temp=-1;
            tvIndScore.setText(""+indScore+"/"+indWickets);
            tvIndPlayer3.setTypeface(null,Typeface.BOLD);
            tvIndPlayer3Status.setText("not out");
            tvIndPlayer3Runs.setText(getResources().getString(R.string.batsmanRuns));
            return;
        }
        if(indOnStrike==2)
        {
            tvIndPlayer2Status.setText("out");
            tvIndPlayer2.setTypeface(null,Typeface.NORMAL);
            indOnStrike=3;
            if(indWickets==2||indBalls==6)
            {
                tvIndScore.setText(""+indScore+"/"+indWickets);
                tvInningsStatus.setText("Pakistan need "+(indScore+1)+" in 6 Balls");
                for (int i = 0, j = 0; i < indRuns.getChildCount()&& j < pakRuns.getChildCount(); i++, j++)
                {
                    View child1 = indRuns.getChildAt(i);
                    child1.setEnabled(false);
                    View child2 = pakRuns.getChildAt(i);
                    child2.setEnabled(true);
                }
                return;
            }
            indPlayer2Temp=-1;
            tvIndScore.setText(""+indScore+"/"+indWickets);
            tvIndPlayer3.setTypeface(null,Typeface.BOLD);
            tvIndPlayer3Status.setText("not out");
            tvIndPlayer3Runs.setText(getResources().getString(R.string.batsmanRuns));
            return;
        }
        if(indOnStrike==3)
        {
            tvIndPlayer3Status.setText("out");
            tvIndPlayer3.setTypeface(null,Typeface.NORMAL);
            tvIndScore.setText(""+indScore+"/"+indWickets);
            tvInningsStatus.setText("Pakistan need "+(indScore+1)+" in 6 Balls");
            for (int i = 0, j = 0; i < indRuns.getChildCount()&& j < pakRuns.getChildCount(); i++, j++)
            {
                View child1 = indRuns.getChildAt(i);
                child1.setEnabled(false);
                View child2 = pakRuns.getChildAt(i);
                child2.setEnabled(true);
            }
                return;
        }
    }

    public void pakZero(View view)
    {
        pakBalls++;
        tvInningsStatus.setText("Pakistan need "+(indScore-pakScore+1)+" in "+(6-pakBalls)+" Balls");
        if(pakWickets==2||pakBalls==6||pakScore>indScore)
        {
            checkIfPakInningsOver();
            return;
        }
    }

    public void pakone(View view)
    {
        pakBalls++;
        pakScore++;
        tvInningsStatus.setText("Pakistan need "+(indScore-pakScore+1)+" in "+(6-pakBalls)+" Balls");
        tvPakScore.setText(""+pakScore+"/"+pakWickets);
        if(pakOnStrike==1)
        {
            pakPlayer1Score++;
            tvPakPlayer1Runs.setText(""+pakPlayer1Score);
            pakOverComplete();
            pakStrikeChange1();
            if(pakWickets==2||pakBalls==6||pakScore>indScore)
            {
                checkIfPakInningsOver();
                return;
            }
            return;
        }
        if(pakOnStrike==2)
        {
            pakPlayer2Score++;
            tvPakPlayer2Runs.setText(""+pakPlayer2Score);
            pakOverComplete();
            pakStrikeChange2();
            if(pakWickets==2||pakBalls==6||pakScore>indScore)
            {
                checkIfPakInningsOver();
                return;
            }
            return;
        }
        if(pakOnStrike==3)
        {
            pakPlayer3Score++;
            tvPakPlayer3Runs.setText(""+pakPlayer3Score);
            pakOverComplete();
            pakStrikeChange3();
            if(pakWickets==2||pakBalls==6||pakScore>indScore)
            {
                checkIfPakInningsOver();
                return;
            }
            return;
        }
    }

    public void paktwo(View view)
    {
        pakBalls++;
        pakScore+=2;
        tvInningsStatus.setText("Pakistan need "+(indScore-pakScore+1)+" in "+(6-pakBalls)+" Balls");
        tvPakScore.setText(""+pakScore+"/"+pakWickets);
        if(pakOnStrike==1)
        {
            pakPlayer1Score+=2;
            tvPakPlayer1Runs.setText(""+pakPlayer1Score);
            pakOverComplete();
            if(pakWickets==2||pakBalls==6||pakScore>indScore)
            {
                checkIfPakInningsOver();
                return;
            }
            return;
        }
        if(pakOnStrike==2)
        {
            pakPlayer2Score+=2;
            tvPakPlayer2Runs.setText(""+pakPlayer2Score);
            pakOverComplete();
            if(pakWickets==2||pakBalls==6||pakScore>indScore)
            {
                checkIfPakInningsOver();
                return;
            }
            return;
        }
        if(pakOnStrike==3)
        {
            pakPlayer3Score+=2;
            tvPakPlayer3Runs.setText(""+pakPlayer3Score);
            pakOverComplete();
            if(pakWickets==2||pakBalls==6||pakScore>indScore)
            {
                checkIfPakInningsOver();
                return;
            }
            return;
        }
    }

    public void pakthree(View view)
    {
        pakBalls++;
        pakScore+=3;
        tvInningsStatus.setText("Pakistan need "+(indScore-pakScore+1)+" in "+(6-pakBalls)+" Balls");
        tvPakScore.setText("" + pakScore + "/" + pakWickets);
        if (pakOnStrike == 1)
        {
            pakPlayer1Score+=3;
            tvPakPlayer1Runs.setText("" + pakPlayer1Score);
            pakOverComplete();
            pakStrikeChange1();
            if(pakWickets==2||pakBalls==6||pakScore>indScore)
            {
                checkIfPakInningsOver();
                return;
            }
            return;
        }
        if (pakOnStrike == 2)
        {
            pakPlayer2Score+=3;
            tvPakPlayer2Runs.setText("" + pakPlayer2Score);
            pakOverComplete();
            pakStrikeChange2();
            if(pakWickets==2||pakBalls==6||pakScore>indScore)
            {
                checkIfPakInningsOver();
                return;
            }
            return;
        }
        if (pakOnStrike == 3)
        {
            pakPlayer3Score+=3;
            tvPakPlayer3Runs.setText("" + pakPlayer3Score);
            pakOverComplete();
            pakStrikeChange3();
            if(pakWickets==2||pakBalls==6||pakScore>indScore)
            {
                checkIfPakInningsOver();
                return;
            }
            return;
        }
    }

    public void pakfour(View view)
    {
        pakBalls++;
        pakScore+=4;
        tvInningsStatus.setText("Pakistan need "+(indScore-pakScore+1)+" in "+(6-pakBalls)+" Balls");
        tvPakScore.setText(""+pakScore+"/"+pakWickets);
        if(pakOnStrike==1)
        {
            pakPlayer1Score+=4;
            tvPakPlayer1Runs.setText(""+pakPlayer1Score);
            pakOverComplete();
            if(pakWickets==2||pakBalls==6||pakScore>indScore)
            {
                checkIfPakInningsOver();
                return;
            }
            return;
        }
        if(pakOnStrike==2)
        {
            pakPlayer2Score+=4;
            tvPakPlayer2Runs.setText(""+pakPlayer2Score);
            pakOverComplete();
            if(pakWickets==2||pakBalls==6||pakScore>indScore)
            {
                checkIfPakInningsOver();
                return;
            }
            return;
        }
        if(pakOnStrike==3)
        {
            pakPlayer3Score+=4;
            tvPakPlayer3Runs.setText(""+pakPlayer3Score);
            pakOverComplete();
            if(pakWickets==2||pakBalls==6||pakScore>indScore)
            {
                checkIfPakInningsOver();
                return;
            }
            return;
        }
    }

    public void paksix(View view)
    {
        pakBalls++;
        pakScore+=6;
        tvInningsStatus.setText("Pakistan need "+(indScore-pakScore+1)+" in "+(6-pakBalls)+" Balls");
        tvPakScore.setText(""+pakScore+"/"+pakWickets);
        if(pakOnStrike==1)
        {
            pakPlayer1Score+=6;
            tvPakPlayer1Runs.setText(""+pakPlayer1Score);
            pakOverComplete();
            if(pakWickets==2||pakBalls==6||pakScore>indScore)
            {
                checkIfPakInningsOver();
                return;
            }
            return;
        }
        if(pakOnStrike==2)
        {
            pakPlayer2Score+=6;
            tvPakPlayer2Runs.setText(""+pakPlayer2Score);
            pakOverComplete();
            if(pakWickets==2||pakBalls==6||pakScore>indScore)
            {
                checkIfPakInningsOver();
                return;
            }
            return;
        }
        if(pakOnStrike==3)
        {
            pakPlayer3Score+=6;
            tvPakPlayer3Runs.setText(""+pakPlayer3Score);
            pakOverComplete();
            if(pakWickets==2||pakBalls==6||pakScore>indScore)
            {
                checkIfPakInningsOver();
                return;
            }
            return;
        }
    }

    public void pakwicket(View view)
    {
        pakBalls++;
        pakWickets++;
        tvPakScore.setText(""+pakScore+"/"+pakWickets);
        tvInningsStatus.setText("Pakistan need "+(indScore-pakScore+1)+" in "+(6-pakBalls)+" Balls");
        if(pakOnStrike==1)
        {
            tvPakPlayer1Status.setText("out");
            tvPakPlayer1.setTypeface(null,Typeface.NORMAL);
            if(pakWickets==2||pakBalls==6||pakScore>indScore)
            {
                checkIfPakInningsOver();
                return;
            }
            pakOnStrike=3;
            pakPlayer1Temp=-1;
            tvPakPlayer3.setTypeface(null,Typeface.BOLD);
            tvPakPlayer3Status.setText("not out");
            tvPakPlayer3Runs.setText(getResources().getString(R.string.batsmanRuns));
            return;
        }
        if(pakOnStrike==2)
        {
            tvPakPlayer2Status.setText("out");
            tvPakPlayer2.setTypeface(null,Typeface.NORMAL);
            pakOnStrike=3;
            if(pakWickets==2||pakBalls==6||pakScore>indScore)
            {
                checkIfPakInningsOver();
                return;
            }
            pakPlayer2Temp=-1;
            tvPakPlayer3.setTypeface(null,Typeface.BOLD);
            tvPakPlayer3Status.setText("not out");
            tvPakPlayer3Runs.setText(getResources().getString(R.string.batsmanRuns));
            return;
        }
        if(pakOnStrike==3)
        {
            tvPakPlayer3Status.setText("out");
            tvPakPlayer3.setTypeface(null,Typeface.NORMAL);
            if(pakScore<indScore)
            {
                tvInningsStatus.setText("India won the match");
            }
            if(pakScore==indScore)
            {
                tvInningsStatus.setText("Match Tied");
            }
            else if(indScore<pakScore)
            {
                tvInningsStatus.setText("pakistan won the match");
            }
            for (int i = 0; i < pakRuns.getChildCount(); i++)
            {
                View child = pakRuns.getChildAt(i);
                child.setEnabled(false);
            }
            return;
        }
    }

    public void indOverComplete()
    {
        if(indBalls==6)
        {
            tvInningsStatus.setText("Pakistan need "+(indScore+1)+" in 6 Balls");
            for (int i = 0, j = 0; i < indRuns.getChildCount()&& j < pakRuns.getChildCount(); i++, j++)
            {
                View child1 = indRuns.getChildAt(i);
                child1.setEnabled(false);
                View child2 = pakRuns.getChildAt(i);
                child2.setEnabled(true);
                tvPakPlayer1Runs.setText(getResources().getString(R.string.batsmanRuns));
                tvPakPlayer2Runs.setText(getResources().getString(R.string.batsmanRuns));
                tvPakPlayer1Status.setText(getResources().getString(R.string.batsmanStatus));
                tvPakPlayer2Status.setText(getResources().getString(R.string.batsmanStatus));
            }
            return;
        }
    }

    public void pakOverComplete()
    {
        if(pakBalls==6)
        {
            if(pakScore<indScore)
            {
                tvInningsStatus.setText("India won the match");
            }
            if(pakScore==indScore)
            {
                tvInningsStatus.setText("Match Tied");
            }
            else if(indScore<pakScore)
            {
                tvInningsStatus.setText("Pakistan won the match");
            }
            for (int i = 0; i < pakRuns.getChildCount(); i++)
            {
                View child = pakRuns.getChildAt(i);
                child.setEnabled(false);
            }
            return;
        }
    }

    public void indStrikeChange1()
    {
        if(indPlayer2Temp==1)
        {
            indOnStrike = 2;
            tvIndPlayer2.setTypeface(null, Typeface.BOLD);
            tvIndPlayer1.setTypeface(null, Typeface.NORMAL);
            return;
        }
        else
        {
            indOnStrike = 3;
            tvIndPlayer3.setTypeface(null, Typeface.BOLD);
            tvIndPlayer1.setTypeface(null, Typeface.NORMAL);
            return;
        }
    }

    public void indStrikeChange2()
    {
        if (indPlayer1Temp == 1)
        {
            indOnStrike = 1;
            tvIndPlayer1.setTypeface(null, Typeface.BOLD);
            tvIndPlayer2.setTypeface(null, Typeface.NORMAL);
            return;
        } else
        {
            indOnStrike = 3;
            tvIndPlayer3.setTypeface(null, Typeface.BOLD);
            tvIndPlayer2.setTypeface(null, Typeface.NORMAL);
            return;
        }
    }

    public void indStrikeChange3()
    {
        if (indPlayer1Temp == 1)
        {
            indOnStrike = 1;
            tvIndPlayer1.setTypeface(null, Typeface.BOLD);
            tvIndPlayer3.setTypeface(null, Typeface.NORMAL);
            return;
        } else
        {
            indOnStrike = 2;
            tvIndPlayer2.setTypeface(null, Typeface.BOLD);
            tvIndPlayer3.setTypeface(null, Typeface.NORMAL);
            return;
        }
    }

    public void pakStrikeChange1()
    {
        if(pakPlayer2Temp==1)
        {
            pakOnStrike = 2;
            tvPakPlayer2.setTypeface(null, Typeface.BOLD);
            tvPakPlayer1.setTypeface(null, Typeface.NORMAL);
            return;
        }
        else
        {
            pakOnStrike = 3;
            tvPakPlayer3.setTypeface(null, Typeface.BOLD);
            tvPakPlayer1.setTypeface(null, Typeface.NORMAL);
            return;
        }
    }

    public void pakStrikeChange2()
    {
        if (pakPlayer1Temp == 1)
        {
            pakOnStrike = 1;
            tvPakPlayer1.setTypeface(null, Typeface.BOLD);
            tvPakPlayer2.setTypeface(null, Typeface.NORMAL);
            return;
        } else
        {
            pakOnStrike = 3;
            tvPakPlayer3.setTypeface(null, Typeface.BOLD);
            tvPakPlayer2.setTypeface(null, Typeface.NORMAL);
            return;
        }
    }

    public void pakStrikeChange3()
    {
        if (pakPlayer1Temp == 1)
        {
            pakOnStrike = 1;
            tvPakPlayer1.setTypeface(null, Typeface.BOLD);
            tvPakPlayer3.setTypeface(null, Typeface.NORMAL);
            return;
        } else
        {
            pakOnStrike = 2;
            tvPakPlayer3.setTypeface(null, Typeface.NORMAL);
            tvPakPlayer2.setTypeface(null, Typeface.BOLD);
            return;
        }
    }

    public void checkIfPakInningsOver()
    {
        tvPakScore.setText(""+pakScore+"/"+pakWickets);
            if(pakScore<indScore) {
                tvInningsStatus.setText("India won the match");
            }
            if(pakScore==indScore)
            {
                tvInningsStatus.setText("Match Tied");
            }
            else if(indScore<pakScore)
            {
                tvInningsStatus.setText("Pakistan won the match");
            }
            for (int i = 0; i < pakRuns.getChildCount(); i++)
            {
                View child = pakRuns.getChildAt(i);
                child.setEnabled(false);
            }
            return;
    }

    public void reset(View view)
    {
        tvInningsStatus.setText(getResources().getString(R.string.first_innings));
        tvIndScore.setText(getResources().getString(R.string.indscore));
        tvPakScore.setText(getResources().getString(R.string.pakscore));
        tvIndPlayer1Runs.setText(getResources().getString(R.string.batsmanRuns));
        tvIndPlayer2Runs.setText(getResources().getString(R.string.batsmanRuns));
        tvIndPlayer3Runs.setText("");
        tvPakPlayer1Runs.setText(getResources().getString(R.string.batsmanRuns));
        tvPakPlayer2Runs.setText(getResources().getString(R.string.batsmanRuns));
        tvPakPlayer3Runs.setText("");
        tvIndPlayer1Status.setText(getResources().getString(R.string.batsmanStatus));
        tvIndPlayer2Status.setText(getResources().getString(R.string.batsmanStatus));
        tvIndPlayer3Status.setText("");
        tvPakPlayer1Status.setText(getResources().getString(R.string.batsmanStatus));
        tvPakPlayer2Status.setText(getResources().getString(R.string.batsmanStatus));
        tvPakPlayer3Status.setText("");
        tvIndPlayer1.setTypeface(null,Typeface.BOLD);
        tvIndPlayer2.setTypeface(null,Typeface.NORMAL);
        tvIndPlayer3.setTypeface(null,Typeface.NORMAL);
        tvPakPlayer1.setTypeface(null,Typeface.BOLD);
        tvPakPlayer2.setTypeface(null,Typeface.NORMAL);
        tvPakPlayer3.setTypeface(null,Typeface.NORMAL);

        for (int i = 0; i < pakRuns.getChildCount(); i++)
        {
            View child = pakRuns.getChildAt(i);
            child.setEnabled(false);
        }

        for (int i = 0; i < indRuns.getChildCount(); i++)
        {
            View child = indRuns.getChildAt(i);
            child.setEnabled(true);
        }
        indOnStrike=1;
        pakOnStrike=1;
        indWickets=0;
        pakWickets=0;
        indScore=0;
        pakScore=0;
        indPlayer1Score=0;
        indPlayer1Temp=1;
        indPlayer2Temp=1;
        pakPlayer1Temp=1;
        pakPlayer2Temp=1;
        indPlayer2Score=0;
        indPlayer3Score=0;
        pakPlayer1Score=0;
        pakPlayer2Score=0;
        indBalls=0;
        pakPlayer3Score=0;
        pakBalls=0;
    }
}
