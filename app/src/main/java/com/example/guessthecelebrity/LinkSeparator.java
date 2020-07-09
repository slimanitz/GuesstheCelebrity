package com.example.guessthecelebrity;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkSeparator {

    private HashMap<String,String> Names_Links = new HashMap<String,String>();

    File file = new File("com/example/guessthecelebrity/Files/html.txt");

    FileInputStream inputStream;







    String html = "<label for=\"choice-ba2a5511-c500-4197-8876-89ac14b19e36-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Afef-Gharbi-1.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-ba2a5511-c500-4197-8876-89ac14b19e36\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Afef-Gharbi-1.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-ba2a5511-c500-4197-8876-89ac14b19e36\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Afef-Gharbi-1.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-ba2a5511-c500-4197-8876-89ac14b19e36-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"ba2a5511-c500-4197-8876-89ac14b19e36\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Afef Gharbi<meta itemprop=\"upvoteCount\" content=\"168\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-41f6fd8f-6bfd-45e4-9390-2bc18ec1a74f-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Amina-Sta-2.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-41f6fd8f-6bfd-45e4-9390-2bc18ec1a74f\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Amina-Sta-2.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-41f6fd8f-6bfd-45e4-9390-2bc18ec1a74f\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Amina-Sta-2.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-41f6fd8f-6bfd-45e4-9390-2bc18ec1a74f-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"41f6fd8f-6bfd-45e4-9390-2bc18ec1a74f\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Amina Sta<meta itemprop=\"upvoteCount\" content=\"90\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-51bd8ac9-f11b-4a64-af5f-2939136d734f-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Amira-Al-Jaziri-1.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-51bd8ac9-f11b-4a64-af5f-2939136d734f\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Amira-Al-Jaziri-1.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-51bd8ac9-f11b-4a64-af5f-2939136d734f\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Amira-Al-Jaziri-1.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-51bd8ac9-f11b-4a64-af5f-2939136d734f-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"51bd8ac9-f11b-4a64-af5f-2939136d734f\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Amira Al Jaziri<meta itemprop=\"upvoteCount\" content=\"119\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-51567fc1-f09e-4224-986b-23a52903baa8-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Azza-Slimene-1.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-51567fc1-f09e-4224-986b-23a52903baa8\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Azza-Slimene-1.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-51567fc1-f09e-4224-986b-23a52903baa8\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Azza-Slimene-1.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-51567fc1-f09e-4224-986b-23a52903baa8-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"51567fc1-f09e-4224-986b-23a52903baa8\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Azza Slimene<meta itemprop=\"upvoteCount\" content=\"131\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-34e0cef8-27c7-4434-910a-1dec6eeccdc8-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Beya-Zardi-2.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-34e0cef8-27c7-4434-910a-1dec6eeccdc8\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Beya-Zardi-2.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-34e0cef8-27c7-4434-910a-1dec6eeccdc8\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Beya-Zardi-2.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-34e0cef8-27c7-4434-910a-1dec6eeccdc8-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"34e0cef8-27c7-4434-910a-1dec6eeccdc8\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Beya Zardi<meta itemprop=\"upvoteCount\" content=\"28\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-2da34ce5-bdd0-4d85-9d23-c90b4b75e888-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Dorra-Zarrouk-1.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-2da34ce5-bdd0-4d85-9d23-c90b4b75e888\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Dorra-Zarrouk-1.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-2da34ce5-bdd0-4d85-9d23-c90b4b75e888\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Dorra-Zarrouk-1.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-2da34ce5-bdd0-4d85-9d23-c90b4b75e888-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"2da34ce5-bdd0-4d85-9d23-c90b4b75e888\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Dorra Zarrouk<meta itemprop=\"upvoteCount\" content=\"150\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-7cf58814-4cf4-43a4-82b4-aee23a3aa87a-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Hend-Sabri-1.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-7cf58814-4cf4-43a4-82b4-aee23a3aa87a\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Hend-Sabri-1.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-7cf58814-4cf4-43a4-82b4-aee23a3aa87a\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Hend-Sabri-1.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-7cf58814-4cf4-43a4-82b4-aee23a3aa87a-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"7cf58814-4cf4-43a4-82b4-aee23a3aa87a\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Hend Sabri<meta itemprop=\"upvoteCount\" content=\"82\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-1e847e3f-1d47-4fd3-ad0c-8f3282f7eb80-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Khaoula-Slimani-2.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-1e847e3f-1d47-4fd3-ad0c-8f3282f7eb80\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Khaoula-Slimani-2.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-1e847e3f-1d47-4fd3-ad0c-8f3282f7eb80\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Khaoula-Slimani-2.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-1e847e3f-1d47-4fd3-ad0c-8f3282f7eb80-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"1e847e3f-1d47-4fd3-ad0c-8f3282f7eb80\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Khaoula Slimani<meta itemprop=\"upvoteCount\" content=\"883\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-7d8d267d-d109-43cf-9ed3-8961ff34871c-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Manel-Amara-1.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-7d8d267d-d109-43cf-9ed3-8961ff34871c\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Manel-Amara-1.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-7d8d267d-d109-43cf-9ed3-8961ff34871c\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Manel-Amara-1.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-7d8d267d-d109-43cf-9ed3-8961ff34871c-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"7d8d267d-d109-43cf-9ed3-8961ff34871c\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Manel Amara<meta itemprop=\"upvoteCount\" content=\"87\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-c3de79a8-b9c9-4403-b925-db49c8503b3e-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Manel-Hamrouni-1.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-c3de79a8-b9c9-4403-b925-db49c8503b3e\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Manel-Hamrouni-1.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-c3de79a8-b9c9-4403-b925-db49c8503b3e\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Manel-Hamrouni-1.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-c3de79a8-b9c9-4403-b925-db49c8503b3e-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"c3de79a8-b9c9-4403-b925-db49c8503b3e\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Manel Hamrouni<meta itemprop=\"upvoteCount\" content=\"105\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-8196bea1-17a7-4353-9b84-4b1f3930850c-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Maram-ben-Aziza-1.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-8196bea1-17a7-4353-9b84-4b1f3930850c\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Maram-ben-Aziza-1.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-8196bea1-17a7-4353-9b84-4b1f3930850c\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Maram-ben-Aziza-1.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-8196bea1-17a7-4353-9b84-4b1f3930850c-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"8196bea1-17a7-4353-9b84-4b1f3930850c\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Maram ben Aziza<meta itemprop=\"upvoteCount\" content=\"95\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-6c92671f-7361-493b-96de-401acb1bb7f1-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Mariem-Ben-Chaâbane-2.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-6c92671f-7361-493b-96de-401acb1bb7f1\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Mariem-Ben-Chaâbane-2.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-6c92671f-7361-493b-96de-401acb1bb7f1\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Mariem-Ben-Chaâbane-2.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-6c92671f-7361-493b-96de-401acb1bb7f1-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"6c92671f-7361-493b-96de-401acb1bb7f1\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Mariem Ben Chaâbane<meta itemprop=\"upvoteCount\" content=\"114\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-c6c0143e-df83-415e-bc34-4281a82513a8-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Mariem-Ben-Mami-1.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-c6c0143e-df83-415e-bc34-4281a82513a8\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Mariem-Ben-Mami-1.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-c6c0143e-df83-415e-bc34-4281a82513a8\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Mariem-Ben-Mami-1.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-c6c0143e-df83-415e-bc34-4281a82513a8-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"c6c0143e-df83-415e-bc34-4281a82513a8\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Mariem Ben Mami<meta itemprop=\"upvoteCount\" content=\"94\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-5204490d-83e3-483f-b627-1b5641d377b1-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Mariem-Dabbegh-2.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-5204490d-83e3-483f-b627-1b5641d377b1\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Mariem-Dabbegh-2.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-5204490d-83e3-483f-b627-1b5641d377b1\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Mariem-Dabbegh-2.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-5204490d-83e3-483f-b627-1b5641d377b1-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"5204490d-83e3-483f-b627-1b5641d377b1\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Mariem Dabbegh<meta itemprop=\"upvoteCount\" content=\"96\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-370a69c4-8908-4373-8d93-ddff7b37d802-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Marwa-Agrebi-1.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-370a69c4-8908-4373-8d93-ddff7b37d802\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Marwa-Agrebi-1.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-370a69c4-8908-4373-8d93-ddff7b37d802\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Marwa-Agrebi-1.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-370a69c4-8908-4373-8d93-ddff7b37d802-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"370a69c4-8908-4373-8d93-ddff7b37d802\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Marwa Agrebi<meta itemprop=\"upvoteCount\" content=\"231\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-00ac0c75-d614-4399-a275-d2eaede38a10-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Maya-Ksouri-1.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-00ac0c75-d614-4399-a275-d2eaede38a10\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Maya-Ksouri-1.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-00ac0c75-d614-4399-a275-d2eaede38a10\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Maya-Ksouri-1.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-00ac0c75-d614-4399-a275-d2eaede38a10-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"00ac0c75-d614-4399-a275-d2eaede38a10\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Maya Ksouri<meta itemprop=\"upvoteCount\" content=\"112\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-d65cfb3d-c53c-464f-88fe-c99fd9ce4bf0-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Meriem-Ben-Hussein-1.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-d65cfb3d-c53c-464f-88fe-c99fd9ce4bf0\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Meriem-Ben-Hussein-1.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-d65cfb3d-c53c-464f-88fe-c99fd9ce4bf0\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Meriem-Ben-Hussein-1.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-d65cfb3d-c53c-464f-88fe-c99fd9ce4bf0-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"d65cfb3d-c53c-464f-88fe-c99fd9ce4bf0\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Meriem Ben Hussein<meta itemprop=\"upvoteCount\" content=\"38\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-aebfd0f4-f8f5-4366-a2cb-3a23edf893c4-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Najla-Ben-Abdallah-1.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-aebfd0f4-f8f5-4366-a2cb-3a23edf893c4\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Najla-Ben-Abdallah-1.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-aebfd0f4-f8f5-4366-a2cb-3a23edf893c4\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Najla-Ben-Abdallah-1.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-aebfd0f4-f8f5-4366-a2cb-3a23edf893c4-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"aebfd0f4-f8f5-4366-a2cb-3a23edf893c4\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Najla Ben Abdallah<meta itemprop=\"upvoteCount\" content=\"75\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-13b4dfa3-7032-49ea-a689-52ef75067418-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Peeka-1.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-13b4dfa3-7032-49ea-a689-52ef75067418\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Peeka-1.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-13b4dfa3-7032-49ea-a689-52ef75067418\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Peeka-1.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-13b4dfa3-7032-49ea-a689-52ef75067418-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"13b4dfa3-7032-49ea-a689-52ef75067418\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Peeka<meta itemprop=\"upvoteCount\" content=\"100\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-fc3387a7-f546-43ca-8415-62a9e65d2bf4-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Racha-Ben-Maaouia-1.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-fc3387a7-f546-43ca-8415-62a9e65d2bf4\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Racha-Ben-Maaouia-1.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-fc3387a7-f546-43ca-8415-62a9e65d2bf4\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Racha-Ben-Maaouia-1.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-fc3387a7-f546-43ca-8415-62a9e65d2bf4-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"fc3387a7-f546-43ca-8415-62a9e65d2bf4\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Racha Ben Maaouia<meta itemprop=\"upvoteCount\" content=\"80\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-bd928788-2e3d-406a-97e9-fadf9e29118f-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Ramla-Dhouibi-2.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-bd928788-2e3d-406a-97e9-fadf9e29118f\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Ramla-Dhouibi-2.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-bd928788-2e3d-406a-97e9-fadf9e29118f\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Ramla-Dhouibi-2.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-bd928788-2e3d-406a-97e9-fadf9e29118f-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"bd928788-2e3d-406a-97e9-fadf9e29118f\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Ramla Dhouibi<meta itemprop=\"upvoteCount\" content=\"41\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-54f535fd-fe5c-4d67-8703-da876d5a7033-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Rania-Toumi-1.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-54f535fd-fe5c-4d67-8703-da876d5a7033\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Rania-Toumi-1.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-54f535fd-fe5c-4d67-8703-da876d5a7033\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Rania-Toumi-1.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-54f535fd-fe5c-4d67-8703-da876d5a7033-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"54f535fd-fe5c-4d67-8703-da876d5a7033\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Rania Toumi<meta itemprop=\"upvoteCount\" content=\"85\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-ef52b8ff-e24b-4f42-afd1-0e1958ccb3e3-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Samira-Magroun-1.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-ef52b8ff-e24b-4f42-afd1-0e1958ccb3e3\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Samira-Magroun-1.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-ef52b8ff-e24b-4f42-afd1-0e1958ccb3e3\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Samira-Magroun-1.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-ef52b8ff-e24b-4f42-afd1-0e1958ccb3e3-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"ef52b8ff-e24b-4f42-afd1-0e1958ccb3e3\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Samira Magroun<meta itemprop=\"upvoteCount\" content=\"118\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-71bf5c3e-69c1-40b9-b6c0-21142615c8ed-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Sherine-Lajmi-1.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-71bf5c3e-69c1-40b9-b6c0-21142615c8ed\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Sherine-Lajmi-1.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-71bf5c3e-69c1-40b9-b6c0-21142615c8ed\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Sherine-Lajmi-1.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-71bf5c3e-69c1-40b9-b6c0-21142615c8ed-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"71bf5c3e-69c1-40b9-b6c0-21142615c8ed\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Sherine Lajmi<meta itemprop=\"upvoteCount\" content=\"86\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-b996c88d-8e57-4e44-a978-1d55a110640c-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/Ahlem-Fekih.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-b996c88d-8e57-4e44-a978-1d55a110640c\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Ahlem-Fekih.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-b996c88d-8e57-4e44-a978-1d55a110640c\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/Ahlem-Fekih.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-b996c88d-8e57-4e44-a978-1d55a110640c-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"b996c88d-8e57-4e44-a978-1d55a110640c\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Ahlem Fekih<meta itemprop=\"upvoteCount\" content=\"344\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>\n" +
            "<label for=\"choice-8d2c73ac-b5cb-45a8-9863-3111bf410d73-selector\" tabindex=\"0\" class=\"totalpoll-question-choices-item totalpoll-question-choices-item-type-image\" itemscope=\"\" itemtype=\"http://schema.org/Answer\">\n" +
            "    <div class=\"totalpoll-question-choices-item-container\">\n" +
            "\n" +
            "\t\t            <div class=\"totalpoll-question-choices-item-content-container\">\n" +
            "                <div class=\"totalpoll-question-choices-item-content\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                <a href=\"https://celebrity.tn/wp-content/uploads/2019/12/ilhem-sghayer-3-819x1024-1.jpg\" class=\"totalpoll-modal-open\" totalpoll-modal=\"#embed-8d2c73ac-b5cb-45a8-9863-3111bf410d73\">\n" +
            "                                    <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/ilhem-sghayer-3-819x1024-1.jpg\">\n" +
            "                                </a>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t                        <div class=\"totalpoll-embed-container totalpoll-embed-type-image\" id=\"embed-8d2c73ac-b5cb-45a8-9863-3111bf410d73\">\n" +
            "                            <img src=\"https://celebrity.tn/wp-content/uploads/2019/12/ilhem-sghayer-3-819x1024-1.jpg\">\n" +
            "                        </div>\n" +
            "\t\t\t\t\t                </div>\n" +
            "            </div>\n" +
            "\n" +
            "        <div class=\"totalpoll-question-choices-item-control\">\n" +
            "            <div class=\"totalpoll-question-choices-item-selector totalpoll-question-choices-item-selector-single\">\n" +
            "\t\t\t\t<input type=\"radio\" id=\"choice-8d2c73ac-b5cb-45a8-9863-3111bf410d73-selector\" name=\"totalpoll[choices][31095c9e-4ef2-4c11-b810-89ed95f9d359][]\" value=\"8d2c73ac-b5cb-45a8-9863-3111bf410d73\">                <div class=\"totalpoll-question-choices-item-selector-box\">\n" +
            "                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n" +
            "                        <use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#totalpoll-check-icon\"></use>\n" +
            "                    </svg>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"totalpoll-question-choices-item-label\">\n" +
            "                <span itemprop=\"text\">Ilhem Sghayer<meta itemprop=\"upvoteCount\" content=\"109\"></span>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</label>";

    String[] Html_Blocks;
    public LinkSeparator(){


        String Name= "";
        String Link = "";
        Html_Blocks = html.split("<label");

        for (int i = 1;i<Html_Blocks.length;i++){

            Pattern LinkPattern = Pattern.compile("img src=\"(.*?)\"");
            Matcher LinkMatcher = LinkPattern.matcher(Html_Blocks[i]);

            while (LinkMatcher.find()) {
                Link = LinkMatcher.group(1);
            }

            LinkPattern = Pattern.compile("12/(.*?).jpg");
            LinkMatcher = LinkPattern.matcher(Link);

            while (LinkMatcher.find()) {
                String temp  = LinkMatcher.group(1);
                Name = (String) temp.replaceAll("[0-9]", "").replaceFirst("-"," ").replace("-","");

            }
            if(Name != "" && Link != "") {
                Names_Links.put(Name, Link);
            }
        }




    }


    public HashMap<String,String> getLinks(){
        return Names_Links;
    }

    public String[] getHtml_Blocks(){
        return Html_Blocks;
    }




}
