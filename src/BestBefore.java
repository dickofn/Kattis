
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo
 */
public class BestBefore {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String data = in.nextLine();
        String splitData[] = data.split("/");

        String year = "",
                month = "",
                day = "";

        boolean kabisat = false,
                validYear = false,
                validMonth = false,
                validDay = false;

        ArrayList<Date> date = new ArrayList<>();

        for (int i = 0; i < splitData.length; i++) {
            String tmp = splitData[i];
            char[] tmp2 = tmp.toCharArray();

            if (tmp.equals("0") || tmp.equals("00")) {
                tmp = "2000";
            } else if (tmp2.length == 1) {
                tmp = "200" + tmp;
            } else if (tmp2.length == 2) {
                tmp = "20" + tmp;
            }

            if (Integer.parseInt(tmp) % 400 == 0) {
                kabisat = true;
            } else if (Integer.parseInt(tmp) % 100 == 0) {
                kabisat = false;
            } else if (Integer.parseInt(tmp) % 4 == 0) {
                kabisat = true;
            } else {
                kabisat = false;
            }

            year = tmp;

            for (int j = 0; j < 2; j++) {
                if (i == 0) {
                    if (j == 0) {
                        month = splitData[i + 1];
                        day = splitData[i + 2];
                    } else {
                        month = splitData[i + 2];
                        day = splitData[i + 1];
                    }
                    if (kabisat == true) {
                        if ((Integer.parseInt(year) >= 2000) && (Integer.parseInt(year) <= 2999)) {
                            validYear = true;
                            if ((Integer.parseInt(month) >= 1) && (Integer.parseInt(month) <= 12)) {
                                validMonth = true;
                                if (Integer.parseInt(month) <= 7) {
                                    if ((Integer.parseInt(month) == 2) && (Integer.parseInt(day) <= 29)) {
                                        validDay = true;
                                    } else if (Integer.parseInt(month) % 2 == 1) {
                                        if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 31)) {
                                            validDay = true;
                                        } else {
                                            validDay = false;
                                        }
                                    } else if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 30)) {
                                        validDay = true;
                                    } else {
                                        validDay = false;
                                    }
                                } else if (Integer.parseInt(month) > 7) {
                                    if (Integer.parseInt(month) % 2 == 0) {
                                        if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 31)) {
                                            validDay = true;
                                        } else {
                                            validDay = false;
                                        }
                                    } else if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 30)) {
                                        validDay = true;
                                    } else {
                                        validDay = false;
                                    }
                                }
                            } else {
                                validMonth = false;
                            }
                        } else {
                            validYear = false;
                        }
                    } else if (kabisat == false) {
                        if ((Integer.parseInt(year) >= 2000) && (Integer.parseInt(year) <= 2999)) {
                            validYear = true;
                            if ((Integer.parseInt(month) >= 1) && (Integer.parseInt(month) <= 12)) {
                                validMonth = true;
                                if (Integer.parseInt(month) <= 7) {
                                    if ((Integer.parseInt(month) == 2) && (Integer.parseInt(day) <= 28)) {
                                        validDay = true;
                                    } else if (Integer.parseInt(month) % 2 == 1) {
                                        if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 31)) {
                                            validDay = true;
                                        } else {
                                            validDay = false;
                                        }
                                    } else if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 30)) {
                                        validDay = true;
                                    } else {
                                        validDay = false;
                                    }
                                } else if (Integer.parseInt(month) > 7) {
                                    if (Integer.parseInt(month) % 2 == 0) {
                                        if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 31)) {
                                            validDay = true;
                                        } else {
                                            validDay = false;
                                        }
                                    } else if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 30)) {
                                        validDay = true;
                                    } else {
                                        validDay = false;
                                    }
                                }
                            } else {
                                validMonth = false;
                            }
                        } else {
                            validYear = false;
                        }
                    }
                } else if (i == 1) {
                    if (j == 0) {
                        month = splitData[i - 1];
                        day = splitData[i + 1];
                    } else {
                        month = splitData[i + 1];
                        day = splitData[i - 1];
                    }
                    if (kabisat == true) {
                        if ((Integer.parseInt(year) >= 2000) && (Integer.parseInt(year) <= 2999)) {
                            validYear = true;
                            if ((Integer.parseInt(month) >= 1) && (Integer.parseInt(month) <= 12)) {
                                validMonth = true;
                                if (Integer.parseInt(month) <= 7) {
                                    if ((Integer.parseInt(month) == 2) && (Integer.parseInt(day) <= 29)) {
                                        validDay = true;
                                    } else if (Integer.parseInt(month) % 2 == 1) {
                                        if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 31)) {
                                            validDay = true;
                                        } else {
                                            validDay = false;
                                        }
                                    } else if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 30)) {
                                        validDay = true;
                                    } else {
                                        validDay = false;
                                    }
                                } else if (Integer.parseInt(month) > 7) {
                                    if (Integer.parseInt(month) % 2 == 0) {
                                        if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 31)) {
                                            validDay = true;
                                        } else {
                                            validDay = false;
                                        }
                                    } else if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 30)) {
                                        validDay = true;
                                    } else {
                                        validDay = false;
                                    }
                                }
                            } else {
                                validMonth = false;
                            }
                        } else {
                            validYear = false;
                        }
                    } else if (kabisat == false) {
                        if ((Integer.parseInt(year) >= 2000) && (Integer.parseInt(year) <= 2999)) {
                            validYear = true;
                            if ((Integer.parseInt(month) >= 1) && (Integer.parseInt(month) <= 12)) {
                                validMonth = true;
                                if (Integer.parseInt(month) <= 7) {
                                    if ((Integer.parseInt(month) == 2) && (Integer.parseInt(day) <= 28)) {
                                        validDay = true;
                                    } else if (Integer.parseInt(month) % 2 == 1) {
                                        if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 31)) {
                                            validDay = true;
                                        } else {
                                            validDay = false;
                                        }
                                    } else if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 30)) {
                                        validDay = true;
                                    } else {
                                        validDay = false;
                                    }
                                } else if (Integer.parseInt(month) > 7) {
                                    if (Integer.parseInt(month) % 2 == 0) {
                                        if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 31)) {
                                            validDay = true;
                                        } else {
                                            validDay = false;
                                        }
                                    } else if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 30)) {
                                        validDay = true;
                                    } else {
                                        validDay = false;
                                    }
                                }
                            } else {
                                validMonth = false;
                            }
                        } else {
                            validYear = false;
                        }
                    }
                } else if (i == 2) {
                    if (j == 0) {
                        month = splitData[i - 1];
                        day = splitData[i - 2];
                    } else {
                        month = splitData[i - 2];
                        day = splitData[i - 1];
                    }
                    if (kabisat == true) {
                        if ((Integer.parseInt(year) >= 2000) && (Integer.parseInt(year) <= 2999)) {
                            validYear = true;
                            if ((Integer.parseInt(month) >= 1) && (Integer.parseInt(month) <= 12)) {
                                validMonth = true;
                                if (Integer.parseInt(month) <= 7) {
                                    if ((Integer.parseInt(month) == 2) && (Integer.parseInt(day) <= 29)) {
                                        validDay = true;
                                    } else if (Integer.parseInt(month) % 2 == 1) {
                                        if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 31)) {
                                            validDay = true;
                                        } else {
                                            validDay = false;
                                        }
                                    } else if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 30)) {
                                        validDay = true;
                                    } else {
                                        validDay = false;
                                    }
                                } else if (Integer.parseInt(month) > 7) {
                                    if (Integer.parseInt(month) % 2 == 0) {
                                        if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 31)) {
                                            validDay = true;
                                        } else {
                                            validDay = false;
                                        }
                                    } else if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 30)) {
                                        validDay = true;
                                    } else {
                                        validDay = false;
                                    }
                                }
                            } else {
                                validMonth = false;
                            }
                        } else {
                            validYear = false;
                        }
                    } else if (kabisat == false) {
                        if ((Integer.parseInt(year) >= 2000) && (Integer.parseInt(year) <= 2999)) {
                            validYear = true;
                            if ((Integer.parseInt(month) >= 1) && (Integer.parseInt(month) <= 12)) {
                                validMonth = true;
                                if (Integer.parseInt(month) <= 7) {
                                    if ((Integer.parseInt(month) == 2) && (Integer.parseInt(day) <= 28)) {
                                        validDay = true;
                                    } else if (Integer.parseInt(month) % 2 == 1) {
                                        if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 31)) {
                                            validDay = true;
                                        } else {
                                            validDay = false;
                                        }
                                    } else if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 30)) {
                                        validDay = true;
                                    } else {
                                        validDay = false;
                                    }
                                } else if (Integer.parseInt(month) > 7) {
                                    if (Integer.parseInt(month) % 2 == 0) {
                                        if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 31)) {
                                            validDay = true;
                                        } else {
                                            validDay = false;
                                        }
                                    } else if ((Integer.parseInt(day) >= 1) && (Integer.parseInt(day) <= 30)) {
                                        validDay = true;
                                    } else {
                                        validDay = false;
                                    }
                                }
                            } else {
                                validMonth = false;
                            }
                        } else {
                            validYear = false;
                        }
                    }
                }
            }

            if (validDay && validMonth && validYear) {
                char jumlahBulan[] = month.toCharArray();
                if (jumlahBulan.length == 1) {
                    month = "0" + month;
                }

                char jumlahHari[] = day.toCharArray();
                if (jumlahHari.length == 1) {
                    day = "0" + day;
                }
                date.add(Date.valueOf(year + "-" + month + "-" + day));
                year = "";
                month = "";
                day = "";
            }
        }

        try {
            if (date.isEmpty()) {
                System.out.println(data + " is illegal");
            } else {
                Collections.sort(date);
                System.out.println(date.get(0));
            }
        } catch (Exception e) {
        }
    }
}
