# ReCiter-Scopus-Model
A model representation of a Scopus article

![Build Status](https://codebuild.us-east-1.amazonaws.com/badges?uuid=eyJlbmNyeXB0ZWREYXRhIjoieTk0VnRBbTAyb1FBMzdWQUl5eU43NGNWNWVvZDZiOERjNk1jd1hubHhUM1licTllK0toU2xCU0djM2Y1cm1iRXVQanpVampqV1NVcmpRRStaTWNjcWVjPSIsIml2UGFyYW1ldGVyU3BlYyI6InZaRmlYeHdIZEtmeURFZkoiLCJtYXRlcmlhbFNldFNlcmlhbCI6MX0%3D&branch=master)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/edu.cornell.weill.reciter/reciter-scopus-model/badge.svg)](https://maven-badges.herokuapp.com/maven-central/edu.cornell.weill.reciter/reciter-scopus-model)
[![GitHub version](https://badge.fury.io/gh/wcmc-its%2FReCiter-Scopus-Model.svg)](https://badge.fury.io/gh/wcmc-its%2FReCiter-Scopus-Model)
[![codebeat badge](https://codebeat.co/badges/b3155e63-e1ae-41db-bc7e-bb3ccaf85d4e)](https://codebeat.co/projects/github-com-wcmc-its-reciter-scopus-model-master)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)
[![Pending Pull-Requests](http://githubbadges.herokuapp.com/wcmc-its/ReCiter-Scopus-Model/pulls.svg?style=flat)](https://github.com/wcmc-its/ReCiter-Scopus-Model/pulls)
[![Open Issues](http://githubbadges.herokuapp.com/wcmc-its/ReCiter-Scopus-Model/issues.svg?style=flat)](https://github.com/wcmc-its/ReCiter-Scopus-Model/issues)
[![star this repo](http://githubbadges.com/star.svg?user=wcmc-its&repo=ReCiter-Scopus-Model&style=flat)](https://github.com/wcmc-its/ReCiter-Scopus-Model)
[![fork this repo](http://githubbadges.com/fork.svg?user=wcmc-its&repo=ReCiter-Scopus-Model&style=flat)](https://github.com/wcmc-its/ReCiter-Scopus-Model/fork)
[![Github All Releases](https://img.shields.io/github/downloads/wcmc-its/ReCiter-Scopus-Model/total.svg)]()
[![Open Source Love](https://badges.frapsoft.com/os/v3/open-source.svg?v=102)](https://github.com/wcmc-its/ReCiter-Scopus-Model/) 



## Data model

The following is a sample record from DynamoDB for the ScopusArticle table.
```
{
  "id": "16162764",
  "scopusarticle": {
    "affiliations": [
      {
        "affiliationCity": "Pittsburgh",
        "affiliationCountry": "United States",
        "affilname": "University of Pittsburgh",
        "afid": 60015543
      },
      {
        "affiliationCity": "Lausanne",
        "affiliationCountry": "United States",
        "affilname": "VA Medical Center",
        "afid": 60014232
      },
      {
        "affiliationCity": "Lausanne",
        "affiliationCountry": "Switzerland",
        "affilname": "Universitat Lausanne Schweiz",
        "afid": 60000239
      }
    ],
    "authors": [
      {
        "afids": [
          60015543,
          60014232
        ],
        "authid": 6602653322,
        "authname": "Aujesky D.",
        "givenName": "Drahomir",
        "initials": "D.",
        "seq": 1,
        "surname": "Aujesky"
      },
      {
        "afids": [
          60015543
        ],
        "authid": 55257719500,
        "authname": "Smith K.",
        "givenName": "Kenneth J.",
        "initials": "K.J.",
        "seq": 2,
        "surname": "Smith"
      },
      {
        "afids": [
          60000239
        ],
        "authid": 7006656677,
        "authname": "Cornuz J.",
        "givenName": "Jacques",
        "initials": "J.",
        "seq": 3,
        "surname": "Cornuz"
      },
      {
        "afids": [
          60015543
        ],
        "authid": 7404029525,
        "authname": "Roberts M.",
        "givenName": "Mark S.",
        "initials": "M.S.",
        "seq": 4,
        "surname": "Roberts"
      }
    ],
    "doi": "10.1378/chest.128.3.1601",
    "pubmedId": 16162764
  }
}

```

