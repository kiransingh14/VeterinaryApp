package kiran.example.vetcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class MainPageActivity extends AppCompatActivity {
    GridLayout mainGridLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        mainGridLayout=(GridLayout) findViewById(R.id.mainGridLayout);
        setSingleEvent(mainGridLayout);
    }

    private void setSingleEvent(GridLayout mainGridLayout) {

        for(int i=0;i<mainGridLayout.getChildCount();i++)
        {
            CardView cardView=(CardView)mainGridLayout.getChildAt(i);
            final int finalI =i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(finalI==0)
                    {
                        Intent intent1=new Intent(MainPageActivity.this,HomeActivity.class);
                        startActivity(intent1);

                    }
                    else if(finalI==1)
                    {
                        Intent intent2=new Intent(MainPageActivity.this,AnimalVaccination.class);
                        startActivity(intent2);
                    }
                    else if(finalI==2)
                    {
                        Intent intent3=new Intent(MainPageActivity.this,InjuriesSolution.class);
                        startActivity(intent3);
                    }
                    else if(finalI==3)
                    {
                        Intent intent4=new Intent(MainPageActivity.this,TickSolutions.class);
                        startActivity(intent4);
                    }
                    else if(finalI==4)
                    {
                        Intent intent5=new Intent(MainPageActivity.this,HeatstrokesSolution.class);
                        startActivity(intent5);
                    }
                    else if(finalI==5)
                    {
                        Intent intent6=new Intent(MainPageActivity.this,SkinProblem.class);
                        startActivity(intent6);
                    }
                    else if(finalI==6)
                    {
                        Intent intent7=new Intent(MainPageActivity.this,SheddingSolution.class);
                        startActivity(intent7);
                    }
                    else if(finalI==7)
                    {
                        Intent intent8=new Intent(MainPageActivity.this,TherapyActivity.class);
                        startActivity(intent8);
                    }
                    else if(finalI==8){
                        Intent intent9=new Intent(MainPageActivity.this,TickSolutions.class);
                        startActivity(intent9);
                        }

                }
            });
        }
    }
    public void onHomeClick(View View){
        startActivity(new Intent(this,RegisterActivity.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);

    }
}