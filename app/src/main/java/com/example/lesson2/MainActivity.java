package com.example.lesson2;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private float first_number = 0;
    private float second_number = 0;
    private int second_not_empty = 0;
    private final int count = 10;
    private int operation = 0;
    private float resultnumbers = 0;
    private int counting = 0;
    private TextView result;




    // SaveInstanteState


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Context context = this;
        Context appContext = getApplicationContext();

        SomeSingleton.getINSTANCE(appContext);

        setContentView(R.layout.constraint_layout);

        Calculator();
        showResult();
    }

    private void Calculator() {
        result = findViewById(R.id.first_number);
        showResult();

        findViewById(R.id.key_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation == 0) {
                    first_number = first_number * count + 1;
                    showResult();
                } else {
                    second_number = second_number * count + 1;
                    second_not_empty = 1;
                }
                showResult();
            }
        });

        findViewById(R.id.key_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation == 0) {
                    first_number = first_number * count + 2;
                    showResult();
                } else {
                    second_number = second_number * count + 2;
                    second_not_empty = 1;
                }
                showResult();
            }
        });
        findViewById(R.id.key_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation == 0) {
                    first_number = first_number * count + 3;
                    showResult();
                } else {
                    second_number = second_number * count + 3;
                    second_not_empty = 1;
                }
                showResult();
            }
        });
        findViewById(R.id.key_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation == 0) {
                    first_number = first_number * count + 4;
                    showResult();
                } else {
                    second_number = second_number * count + 4;
                    second_not_empty = 1;
                }
                showResult();
            }
        });
        findViewById(R.id.key_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation == 0) {
                    first_number = first_number * count + 5;
                    showResult();
                } else {
                    second_number = second_number * count + 5;
                    second_not_empty = 1;
                }
                showResult();
            }
        });
        findViewById(R.id.key_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation == 0) {
                    first_number = first_number * count + 6;
                    showResult();
                } else {
                    second_number = second_number * count + 6;
                    second_not_empty = 1;
                }
                showResult();
            }
        });
        findViewById(R.id.key_7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation == 0) {
                    first_number = first_number * count + 7;
                    showResult();
                } else {
                    second_number = second_number * count + 7;
                    second_not_empty = 1;
                }
                showResult();
            }
        });
        findViewById(R.id.key_8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation == 0) {
                    first_number = first_number * count + 8;
                    showResult();
                } else {
                    second_number = second_number * count + 8;
                    second_not_empty = 1;
                }
                showResult();
            }
        });
        findViewById(R.id.key_9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation == 0) {
                    first_number = first_number * count + 9;
                    showResult();
                } else {
                    second_number = second_number * count + 9;
                    second_not_empty = 1;
                }
                showResult();
            }
        });
        findViewById(R.id.key_0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation == 0) {
                    first_number = first_number * count;
                    showResult();
                } else {
                    second_number = second_number * count ;
                    second_not_empty = 1;
                }
                showResult();
            }
        });
        findViewById(R.id.key_clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_number = 0;
                operation = 0;
                second_number = 0;
                second_not_empty =0;
                showResult();
            }
        });
        findViewById(R.id.key_plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = 1;
                showResult();
            }
        });
        findViewById(R.id.key_minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = 2;
                showResult();
            }
        });
        findViewById(R.id.key_multiply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = 3;
                showResult();
            }
        });
        findViewById(R.id.key_divide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = 4;
                showResult();
            }
        });
        findViewById(R.id.key_result).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counting = 1;
                CountingResult();
                showResult();
                counting = counting - 1;
                second_number = 0;
            }
        });
    }

    private void CountingResult() {
        if (operation == 1 && counting == 1) {
            resultnumbers = first_number + second_number;
        }
        ;
        if (operation == 2 && counting == 1) {
            resultnumbers = first_number - second_number;
        }
        ;
        if (operation == 3 && counting == 1) {
            resultnumbers = first_number * second_number;
        }
        ;
        if (operation == 4 && counting == 1) {
            if (second_number == 0) {
                result.setText(String.valueOf("????????!"));}
            else {
            resultnumbers = first_number / second_number;}
        }
        ;

    }

    private void showResult() {
        result.setText(String.valueOf(Math.round(first_number)));
        if (operation == 1) {
            result.setText(String.valueOf(Math.round(first_number) + "  +"));
        }
        if (operation == 2) {
            result.setText(String.valueOf(Math.round(first_number) + "  -"));
        }
        if (operation == 3) {
            result.setText(String.valueOf(Math.round(first_number) + "  *"));
        }
        if (operation == 4) {
            result.setText(String.valueOf(Math.round(first_number) + "  /"));
        }
        if (operation == 4 && second_not_empty != 0) {
            result.setText(String.valueOf(Math.round(first_number) + "  /  " + Math.round(second_number)));
        }
        if (operation == 3 && second_not_empty != 0) {
            result.setText(String.valueOf(Math.round(first_number) + "  *  " + Math.round(second_number)));
        }
        if (operation == 2 && second_not_empty != 0) {
            result.setText(String.valueOf(Math.round(first_number) + "  -  " + Math.round(second_number)));
        }
        if (operation == 1 && second_not_empty != 0) {
            result.setText(String.valueOf(Math.round(first_number) + "  +  " + Math.round(second_number)));
        }
        if (operation == 1 && counting == 1) {
            result.setText(String.valueOf(Math.round(first_number) + "  +  " + Math.round(second_number) + " = " + resultnumbers));
        }
        if (operation == 2 && counting == 1) {
            result.setText(String.valueOf(Math.round(first_number) + "  -  " + Math.round(second_number) + " = " + resultnumbers));
        }
        if (operation == 3 && counting == 1) {
            result.setText(String.valueOf(Math.round(first_number) + "  *  " + Math.round(second_number) + " = " + resultnumbers));
        }
        if (operation == 4 && counting == 1) {
            if (second_number == 0) {
                result.setText(String.valueOf("????????!"));
            } else {
                result.setText(String.valueOf(Math.round(first_number) + "  /  " + Math.round(second_number) + " = " + resultnumbers));
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        logEvent("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logEvent("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logEvent("onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        logEvent("onStop");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        logEvent("onSaveInstantState");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logEvent("onDestroy");
    }

    private void logEvent(String event) {
        Log.d("MainLog", event);
    }

}