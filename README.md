# Allegrocare <img src="https://raw.githubusercontent.com/fias786/Allegrocare/main/assets/trans_icon.png" width="25" height="25"/>

## Inspiration
We all are Humans & we all get allergies at some point in our life. 🤧 Now with the advent of summer, we become the target of various allergies. But if you decide to Google your symptoms… well, you have Cancer! 😨 Skin Allergies are itchy and if you scratch, the pain multiplies. Immediate treatments are necessary but good luck finding a dermatologist in this pandemic. 𝙒𝙝𝙖𝙩 𝙞𝙛 𝙩𝙝𝙚𝙧𝙚 𝙬𝙖𝙨 𝙨𝙤𝙢𝙚𝙗𝙤𝙙𝙮 𝙬𝙝𝙤 𝙘𝙤𝙪𝙡𝙙 𝙞𝙙𝙚𝙣𝙩𝙞𝙛𝙮 𝙖𝙣𝙙 𝙙𝙚𝙩𝙚𝙘𝙩 𝙩𝙝𝙤𝙨𝙚 𝙖𝙡𝙡𝙚𝙧𝙜𝙞𝙚𝙨?

Don't worry, we got your back! 😎

## What it does
𝐀𝐥𝐥𝐞𝐠𝐫𝐨𝐂𝐚𝐫𝐞 is an artificially intelligent mobile app that analyses skin allergies & recommends remedies for the same. We have generated our own Tensorflow Lite Model which showed an accuracy greater than 84% and used Firebase ML Kit to host the same. Our skin lesion detection algorithm provides accurate and fast results and is packed with vital resources to fight against different allergies. COVID-19 Lockdown in several countries is still not over & we have also taken care of that. Our app provides live consultancy of allergies over our embedded chat feature via connecting to your nearest proximity heath clinic. Our app is available in most local languages like Hindi, Bengali, Chinese, Korean, etc.

## How we built it
Our project 𝐀𝐥𝐥𝐞𝐠𝐫𝐨𝐂𝐚𝐫𝐞 is crafted with ❤️. The application itself is built by using Android. The custom Tf.lite model (MobileNet V2 post-trained on Ham10000 Dataset) is used for the analysis of the skin lesion. For the backend, we're using GCP for image post-processing & endpoint data compression as well as Firebase ML-Kit to host the same. The authentication of our app is being served via Firebase Authentication. And last but not the least, the chat server was deployed on a free dyno of Heroku.


## Challenges we ran into
Our team is fortunate to incorporate a diverse range of skills from coding to design, and business. Admittedly, with such a wide range of skills (and ideas), it took us some time to decide on a final concept, but this delay was worth it as it meant we gained a thorough understanding of the problem area. 

Since the time span was short, we had to use an opensourced Harvard [Dataset](https://dataverse.harvard.edu/dataset.xhtml?persistentId=doi:10.7910/DVN/DBW86T). The most challenging part for all of us was to reduce the loss while training the dataset. We had to refactor and trim significant amount of labelled datas so that the model becomes lightweight to be used in low-spec smartphones. It's great to note that, the model was classified under skin & food allergies. Moreover, since all of us are working remotely, it did cost us a bit more time, but we are happy to able to finish it. 


## Accomplishments that we're proud of
We are proud of finishing the project on time which seemed like a tough task initially but happily were also able to add most of the features that we envisioned for the app during ideation.

## What we learned
A lot of things, both summed up in technical & non-technical sides. Also not to mention, we enhanced our googling and Stackoverflow searching skill during the hackathon 😆

## What's next for Allegrocare
We just really want this project to create a positive impact on everyone's lives. Still, we would love to make it more scalable & cross-platform so that the user interaction increases & we can help people get the right treatment at the right moment! :)

Resource links : [Harvard Dataset](https://dataverse.harvard.edu/dataset.xhtml?persistentId=doi:10.7910/DVN/DBW86T), [@vbookshelf](https://www.kaggle.com/vbookshelf/skin-lesion-analyzer-tensorflow-js-web-app)
